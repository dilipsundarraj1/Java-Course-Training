package com.learnJava.variables;

/**
 * Created by z001qgd on 1/31/18.
 */
public class Train {

    String trainName;
    int trainNumber;
    static int count;

    public Train(String trainName, int trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    public static void main(String[] args) {

        Train train1 = new Train("xyz", 123);
        Train.count =1; // Always access the class variable using the class name.
        Train train2 = new Train("xyz", 456);
        Train.count =2; // Always access the class variable using the class name.

        System.out.println(train1.count); // This will print 2 because this is a class level variable, not an instance level.
        System.out.println(train2.count); // This will print 2 because this is a class level variable, not an instance level.


    }


}
