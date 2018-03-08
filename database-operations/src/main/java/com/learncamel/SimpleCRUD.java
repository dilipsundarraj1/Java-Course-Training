package com.learncamel;

import com.learncamel.config.DataBaseConfig;
import com.learncamel.domain.Student;
import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleCRUD {

    BasicDataSource dataSource ;

    public SimpleCRUD(){

        dataSource = DataBaseConfig.getDataSource();
    }


    private static final Logger logger =
            LoggerFactory.getLogger(SimpleCRUD.class);

    private String INSERT_SQL = "INSERT INTO STUDENTS VALUES (? , ? , ?)";

    private String SELECT_SQL = "SELECT * FROM STUDENTS WHERE STUDENT_NO = ?";

    private String DELETE_SQL = "DELETE FROM STUDENTS WHERE STUDENT_NO = ?";

    private String UPDATE_SQL = "UPDATE STUDENTS  SET STUDENT_NAME =? WHERE STUDENT_NO = ?";

    public boolean insertStudent(Student student){

        boolean result=false;

        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection = dataSource.getConnection();

            preparedStatement =
                    connection.prepareStatement(INSERT_SQL);

            preparedStatement.setInt(1,student.getSerialNo());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getGrade());


            preparedStatement.execute();
            result=true;
            logger.info("Result of the execution is : " + result);
        } catch (SQLException e) {
            logger.error("SQL Exception in insertStudent : " + e);
        }finally {
            closeConnection(connection);
            closePreparedStatement(preparedStatement);
        }

        if(result)
            logger.info("Student is successfully inserted in to the DB");
        else
            logger.info("Student not inserted in to the DB");

        return result;

    }


    public Student getStudentBySerialNo(int serialNo) {

        Student student=null;
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        try {
            connection = dataSource.getConnection();

            preparedStatement =
                    connection.prepareStatement(SELECT_SQL);

            preparedStatement.setInt(1,serialNo);


            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                student = new Student();
                student.setName(resultSet.getString("STUDENT_NAME"));
                student.setGrade(resultSet.getString("GRADE"));
                student.setSerialNo(resultSet.getInt("STUDENT_NO"));

            }
        } catch (SQLException e) {
            logger.error("SQL Exception in insertStudent : " + e);
        }finally {
            closeConnection(connection);
            closePreparedStatement(preparedStatement);
        }

        return student;
    }

    public boolean deleteStudent(int serialNo) {

        boolean result=false;

        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection = dataSource.getConnection();

            preparedStatement =
                    connection.prepareStatement(DELETE_SQL);

            preparedStatement.setInt(1,serialNo);
            preparedStatement.execute();
            result=true;
            logger.info("Result of the execution is : " + result);
        } catch (SQLException e) {
            logger.error("SQL Exception in insertStudent : " + e);
        }finally {
            closeConnection(connection);
            closePreparedStatement(preparedStatement);
        }

        if(result)
            logger.info("Student is successfully deleted in to the DB");
        else
            logger.info("Student not deleted from the DB");

        return result;
    }

    public void closeConnection(Connection connection){

        try {
            if(connection!=null)
                connection.close();
        } catch (SQLException e) {
            logger.error("Exception occured while closing the connection : " + e);
        }

    }

    public void closePreparedStatement(PreparedStatement pstmt){

        try {
            if(pstmt!=null)
                pstmt.close();
        } catch (SQLException e) {
            logger.error("Exception occured while closing the connection : " + e);
        }

    }



    public static void main(String[] args) {

    }

    public boolean updateStudent(Student updateStudent) {

        boolean result=false;

        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection = dataSource.getConnection();

            preparedStatement =
                    connection.prepareStatement(UPDATE_SQL);


            preparedStatement.setString(1,updateStudent.getName());
            preparedStatement.setInt(2,updateStudent.getSerialNo());


            preparedStatement.execute();
            result=true;
            logger.info("Result of the execution is : " + result);
        } catch (SQLException e) {
            logger.error("SQL Exception in insertStudent : " + e);
        }finally {
            closeConnection(connection);
            closePreparedStatement(preparedStatement);
        }

        if(result)
            logger.info("Student is successfully updated in to the DB");
        else
            logger.info("Student not updated in to the DB");

        return result;

    }
}
