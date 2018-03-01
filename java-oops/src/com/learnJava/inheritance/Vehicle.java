package com.learnJava.inheritance;

public class Vehicle {

    private int wheels;
    private String type;
    private String owner;
    private int year;
    private String color;

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void drive(){
        System.out.println("Inside the vehicle drive method");
    }

}
