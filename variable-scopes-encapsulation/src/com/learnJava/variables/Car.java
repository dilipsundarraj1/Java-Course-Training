package com.learnJava.variables;

/**
 * Created by z001qgd on 1/31/18.
 */
public class Car {

    String owner;
    String model;
    int year;

    public Car(String owner, String model, int year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        Car camry = new Car("xyz","camry",2005); // camry is a instance variable.

    }
}
