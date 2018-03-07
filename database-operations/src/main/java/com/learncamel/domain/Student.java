package com.learncamel.domain;

public class Student {

    private int serialNo;
    private String name;
    private String grade;

    public Student(){

    }

    public Student(int serialNo, String name, String grade) {
        this.serialNo = serialNo;
        this.name = name;
        this.grade = grade;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "serialNo=" + serialNo +
                ", name=" + name +
                ", grade=" + grade +
                '}';
    }
}
