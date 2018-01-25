package com.learnJava.operators;

/**
 * Created by z001qgd on 1/25/18.
 */
public class OrderPrecedence {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = ++x * y-- + 1; // Result is 61.

        System.out.println(z);

        System.out.println(1+2*4*3); //25 * -> takes preference and then addition

        System.out.println((2+3)*5); //25 () -> Paranthesis take precendence and then multiplication.
    }
}
