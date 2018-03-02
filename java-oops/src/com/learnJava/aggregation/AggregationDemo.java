package com.learnJava.aggregation;

public class AggregationDemo {

    public static void main(String[] args) {

        Student student = new Student();
        Address schoolAddress = new Address("1234 Lane", "city1","state1","55122");
        Address homeAddress = new Address("5678 Lane", "city1","state1","55122");

        student.setGrade("2");
        student.setName("ADAM");
        student.setHomeAddress(homeAddress);
        student.setSchoolAddress(schoolAddress);

        System.out.println("Student is : " + student.toString());
    }
}
