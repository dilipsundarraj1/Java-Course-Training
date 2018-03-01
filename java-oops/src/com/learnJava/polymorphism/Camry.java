package com.learnJava.polymorphism;

public class Camry implements Car {
    public void passengers(String passenger1){

        System.out.println("Passenger is : " + passenger1);
    }

    public void passengers(String passenger1,String passenger2){

        System.out.println("Passengers are : " + passenger1 + " and "+ passenger2);
    }

    @Override
    public void speed(int speed) {
        System.out.println("Inside Camrys speed : " + speed);
    }
}
