package com.learnJava.referenceVariable;

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

    public void changeModel(Car car1){
        car1.model = "corolla";
    }

    public static void main(String[] args) {

        Car car = new Car("camry", "Toyota");
        System.out.println(car.model);
        car.changeModel(car);
        System.out.println("After the call");
        System.out.println(car.model);
    }
}
