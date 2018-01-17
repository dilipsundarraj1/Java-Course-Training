package com.learnJava.staticc;

/**
 * Created by z001qgd on 1/17/18.
 */
public class Train {

    private int trainNumber; // instance variable
    private static int count=0; // static variable

    private static final int salary=50000;

    public Train(int name) {
        this.trainNumber = name;
    }

    public static void main(String[] args) {

        Train train1 = new Train(10);
        train1.count = 1; // Wrong
        Train.count =1; // Right


        Train train2 = new Train(11);
        train2.count = 2; // Wrong
        Train.count =2; // Right
    }
}
