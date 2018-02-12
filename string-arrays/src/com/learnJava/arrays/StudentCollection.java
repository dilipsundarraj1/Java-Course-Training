package com.learnJava.arrays;

/**
 * Created by z001qgd on 2/12/18.
 */
public class StudentCollection {

    private Student[] students = new Student[5];
    int count=0;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void addStudent(Student student) {
        students[count] = student;
        count =count+1;
    }

    public void printStudents(){

        for(Student stu : students)
            System.out.println(stu);
    }
}
