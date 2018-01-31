package com.learnJava.wrapper;

/**
 * Created by z001qgd on 1/26/18.
 */
public class IntegerExample {



    public static void main(String[] args) {

        int x =2; // Assigning a value to a int variable. Only one approach

        Integer ii=2; // assigning the value

        Integer i2=new Integer(2); // Using the new operator

        Integer i3=new Integer("123"); // using the String value


        Integer i4=Integer.valueOf("6"); //Using the valueOf method.

        System.out.println(i4.floatValue()); // Integer to a float value

        System.out.println(i4.doubleValue()); // Integer to a double value

        System.out.println(i4.byteValue()); // Integer to a byte value

        System.out.println(i4.longValue()); // Integer to a long value

        System.out.println(i4.shortValue()); // Integer to a short value
    }
}
