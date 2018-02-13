package com.learnJava.arrays;

/**
 * Created by z001qgd on 2/13/18.
 */
public class StudentClient {

    public static void main(String[] args) {

            Student student = new Student("xyz","abc");
            Student student1 = new Student("xyz1","abc1");
            Student student2 = new Student("xyz2","abc2");
            Student student3 = new Student("xyz3","abc3");
            Student student4 = new Student("xyz","abc4");

            System.out.println(student.equals(student4)); // returns true

    }
}
