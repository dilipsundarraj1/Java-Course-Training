package com.learnJava.arrays;

/**
 * Created by z001qgd on 2/12/18.
 */
public class StudentCollectionClient {

    public static void main(String[] args) {

        Student student = new Student("xyz","abc");
        Student student1 = new Student("xyz1","abc1");
        Student student2 = new Student("xyz2","abc2");
        Student student3 = new Student("xyz3","abc3");
        Student student4 = new Student("xyz4","abc4");

        StudentCollection studentCollection = new StudentCollection();
        studentCollection.addStudent(student);
        studentCollection.addStudent(student1);
        studentCollection.addStudent(student2);
        studentCollection.addStudent(student3);
        studentCollection.addStudent(student4);

        studentCollection.printStudents();

        //studentCollection.addStudent(student4);//Array Index Out of bounds exception

    }
}
