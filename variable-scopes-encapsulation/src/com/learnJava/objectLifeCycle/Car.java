package com.learnJava.objectLifeCycle;

/**
 * Created by z001qgd on 1/31/18.
 */
public class Car {

    String owner;
    String model;
    int year;

    public Car() {
    }

    public Car(String owner, String model, int year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public void createCarObject(){

        Car car = new Car("xyz","Camry", 2009); // this object will be garbage collected after the execution of this method.
    }

    public static void main(String[] args) {

        new Car().createCarObject();

        System.gc();

        Runtime.getRuntime().gc();

    }
}
