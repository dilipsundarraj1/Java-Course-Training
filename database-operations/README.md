### Install Postgres Database

-   Follow the below video to install postgres in your local machine.


https://youtu.be/MIBF76FsZt8



### How DB Connection Works ?

![](https://github.com/dsaish3/Java-Course-Training/blob/master/database-operations/images/db-connection.png)


### Gradle dependecies:

```
    compile group: 'commons-pool', name: 'commons-pool', version: '1.6' // db pool
    compile group: 'org.apache.commons', name: 'commons-dbcp2', version: '2.2.0' //connection details
    compile group: 'commons-logging', name: 'commons-logging', version: '1.2' // logging details
    compile group: 'org.postgresql', name: 'postgresql', version: '9.4.1212' // this has the driver details
```

### Student Table

```aidl
CREATE TABLE STUDENTS (
    STUDENT_NO NUMERIC,
    STUDENT_NAME TEXT,
    GRADE TEXT,
    CRTE_TS TIMESTAMPTZ NULL default current_timestamp
);
```

### How to create a DB DataSource using Java?


```
public class DataBaseConfig {

    private static BasicDataSource dataSource;

    public static BasicDataSource getDataSource()
    {

        if (dataSource == null)
        {
            BasicDataSource ds = new BasicDataSource();
            ds.setUrl("jdbc:postgresql://localhost:5432/localDB");
            ds.setUsername("postgres");
            ds.setPassword("postgres");
            ds.setDriverClassName("org.postgresql.Driver");


            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(100);

            dataSource = ds;
        }
        return dataSource;
    }
}
```


### How to perform insert in to DB ?

-   Connection
-   PreparedStatement
-   SQL (Structured Query language)

```aidl
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
```