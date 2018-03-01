package com.learnJava.polymorphism;

public class Accord implements  Car{
    @Override
    public void speed(int speed) {
        System.out.println("Inside Accords speed : " + speed);
    }
}
