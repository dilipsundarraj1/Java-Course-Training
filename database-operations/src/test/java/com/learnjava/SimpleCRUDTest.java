package com.learnjava;

import com.learncamel.SimpleCRUD;
import com.learncamel.domain.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SimpleCRUDTest {

    SimpleCRUD simpleCRUD;

    Student newStudent;

    Student updateStudent;

    @Before
    public void setUp(){
        simpleCRUD = new SimpleCRUD();
        newStudent = new Student(100,"ABC","1" );
        updateStudent = new Student(100,"XYZ","1" );
    }

    @Test
    public  void insertStudent(){

        boolean result = simpleCRUD.insertStudent(newStudent);
        assertTrue(result);

    }

    @Test
    public  void getStudentBySerialNo(){
        int serialNo=100;
        Student student = simpleCRUD.getStudentBySerialNo(serialNo);
        assertNotNull(student);

    }

    @Test
    public  void deleteStudent(){
        int serialNo=100;
        boolean result = simpleCRUD.deleteStudent(serialNo);
        assertTrue(result);

    }

    @Test
    public  void updateStudent(){
        boolean result = simpleCRUD.updateStudent(updateStudent);
        assertTrue(result);

    }

}
