package com.learnJava.arrays;

/**
 * Created by z001qgd on 2/12/18.
 */
public class Student {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    private String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.name.equals(student.name); // we consider the student is the same if their names are same.
    }
}
