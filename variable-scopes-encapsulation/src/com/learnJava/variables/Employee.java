package com.learnJava.variables;

/**
 * Created by z001qgd on 1/31/18.
 */
public class Employee {

    String firstName;
    String lastName;
    int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void changeLastName(){

        String firstName = "123"; // Same firstName variable can be declared with the same name.
        this.firstName = firstName+this.firstName;

    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("xyz","abc", 12000);
        employee1.changeLastName();
        System.out.println(employee1.firstName);
        Employee employee2 = new Employee("abc","xyz", 12000);
        employee2.changeLastName();
        System.out.println(employee2.firstName);


    }
}
