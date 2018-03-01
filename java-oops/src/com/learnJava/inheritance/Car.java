package com.learnJava.inheritance;

public class Car extends Vehicle {

    private int noOfSeats;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;


    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfSeats=" + noOfSeats +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void drive(){

    System.out.println("Inside Car drive method");
    }
}
