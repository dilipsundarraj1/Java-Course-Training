package com.learnJava.abstractt;

public abstract class Employee {

    private String name;
    private  static final int HOURS = 2080;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculateSalaty(int hourlyPay){
        return 2080 * hourlyPay;
    }
}
