package com.learnJava.nonprimitivedatatype;

/**
 * Created by z001qgd on 1/18/18.
 */
public class Car {

    private  String model;
    private  String make;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public static void main(String[] args) {

        Car car = new Car("camry", "Toyota");
    }
}
