package com.learnJava.overloadedmethods;

/**
 * Created by z001qgd on 2/2/18.
 */
public class Multiplication {


    public int multiply(int i, int i1) {

        return i*i1;
    }

    public int multiply(int i, int i1,int i2) { // Same Method name with three integers , THis is called method overloading

        return i*i1*i2;
    }

    public String multiply(){ // Same Method with no arguments , THis is called method overloading

        return "Hello";
    }


    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();

        int result = multiplication.multiply(1,2);

        System.out.println("Multiplciation of two numbers : "+result); // result is 2

       result =  multiplication.multiply(1,2,3);

        System.out.println("Multiplciation of three numbers : "+result);  // result is 6

        System.out.println("Text from Multiply  : " + multiplication.multiply()); // prints the String "Hello"

    }


}
