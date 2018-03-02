package com.learnJava.abstractt;

public class SoftwareEngineerDemo {
    public static void main(String[] args) {

        SoftWareEngineer softWareEngineer = new SoftWareEngineer("ABC");
        System.out.println(softWareEngineer.getName());

        System.out.println(softWareEngineer.calculateSalaty(50));

        Manager manager = new Manager("XYZ");

        System.out.println(softWareEngineer.calculateSalaty(65));
    }
}
