package com.learnJava.inheritance;

public class MotorBike extends Vehicle {

    private String model;

    public MotorBike(){

    }
    public MotorBike(String model) {
        this.model = model;
    }


    @Override
    public void drive(){

        System.out.println("Inside MotorBike drive method");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "model='" + model + '\'' +
                '}';
    }
}
