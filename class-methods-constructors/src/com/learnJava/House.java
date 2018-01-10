package com.learnJava;

/**
 * Created by z001qgd on 1/10/18.
 */
public class House {

    private int houseNumber;
    private String houseAddress;

    public static void main(String[] args) {

        House house1 = new House();
        house1.houseNumber = 123;
        house1.houseAddress = "address line, eagan, mn - 55122";


        House house2 = new House();
        house2.houseNumber = 456;
        house2.houseAddress = "address line, eagan, mn - 55122";

        House house3 = new House();
        house3.houseNumber = 789;
        house3.houseAddress = "address line, eagan, mn - 55122";

    }
}
