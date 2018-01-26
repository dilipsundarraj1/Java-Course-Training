package com.learnJava.wrapper;

/**
 * Created by z001qgd on 1/26/18.
 */
public class BooleanExample {

    public static void main(String[] args) {

        Boolean b = false;
        System.out.println(b);
        Boolean b1 = new Boolean(false);
        System.out.println(b1);
        Boolean b2 = new Boolean("true");
        System.out.println(b2);
        Boolean b3 = new Boolean("x");
        System.out.println(b3);

        System.out.println(b.compareTo(b1)); // returns 0 , both are equal
        System.out.println(b3.compareTo(b2));// returns -1 , false.equals(true)
        System.out.println(b2.compareTo(b3));// returns 1 , true.equals(false)

    }
}
