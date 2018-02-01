package com.learnJava.objectLifeCycle;

/**
 * Created by z001qgd on 2/1/18.
 */
public class Student {

    String name;
    String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public static void main(String[] args) {

        Student student = new Student("Sam", "XYZ"); // Object is created.
    }
}
