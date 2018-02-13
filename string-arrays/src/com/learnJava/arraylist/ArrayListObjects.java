package com.learnJava.arraylist;

import com.learnJava.arrays.Student;

import java.util.ArrayList;

/**
 * Created by z001qgd on 2/13/18.
 */
public class ArrayListObjects {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        Student student = new Student("xyz","abc");
        Student student1 = new Student("xyz1","abc1");
        Student student2 = new Student("xyz2","abc2");
        Student student3 = new Student("xyz3","abc3");
        Student student4 = new Student("xyz","abc4");

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList); // prints [Student{name='xyz', school='abc'}, Student{name='xyz1', school='abc1'}, Student{name='xyz2', school='abc2'}, Student{name='xyz3', school='abc3'}, Student{name='xyz4', school='abc4'}]


        /**
         * How to Iterate an array
         */

        for(Student stu : studentList){
            System.out.println(stu);
        }

        ArrayList<Student> studentCopyList = studentList;



        ArrayList<Student> studentCloneList = (ArrayList<Student>) studentList.clone();

        System.out.println(studentCloneList == studentList); // returns false

    }
}
