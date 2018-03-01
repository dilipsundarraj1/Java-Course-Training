package com.learnJava.polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {


        Car car;
        car = new Camry();

        car.speed(200);
        car = new Accord();
        car.speed(300);

        Camry camry = new Camry();

        camry.passengers("ABC"); // Car has only one passanger
        camry.passengers("ABC","XYZ");// Car has two passangers.

    }
}
