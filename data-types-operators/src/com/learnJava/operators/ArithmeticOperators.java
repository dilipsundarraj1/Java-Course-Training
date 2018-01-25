package com.learnJava.operators;

/**
 * Created by z001qgd on 1/23/18.
 */
public class ArithmeticOperators {

    public static void main(String[] args) {

        int a =8;
        int b =4;

        System.out.println("Addition is : " + (a+b)); // Result is 12 , Addition
        System.out.println("Subtraction is : " + (a-b)); // Result is 4 , Subtraction
        System.out.println("Multiplication is : " + (a*b)); // Result is 32 , Multiplication
        System.out.println("Division is : " +(a/b)); // Result is 2, Subtraction
        System.out.println("Modulus is : " + (8%4)); // Result is 0, returns the remainder from the division.
        System.out.println("Modulus is : " + (8%5)); // Result is 3, returns the remainder from the division.

        int c = ++a;
        System.out.println(++a); // Pre Increment
        System.out.println("c is : " + c);

        System.out.println("Before increment" + b);
        int d = b++;
        System.out.println("After Increment" + b); // Post Increment
        System.out.println("d is : " + d);

    }
}
