package com.learnJava.inheritance;

public class ElectricCar extends Car{


    private int chargeLevel;

    public ElectricCar() {
    }

    public ElectricCar(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @Override
    public void drive(){

        System.out.println("Inside Electric drive method");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "chargeLevel=" + chargeLevel +
                '}';
    }
}
