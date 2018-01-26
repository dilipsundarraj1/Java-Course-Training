package com.learnJava.wrapper;

/**
 * Created by z001qgd on 1/26/18.
 */
public class ComparingIntegers {

    public static void main(String[] args) {

        Integer i1 = new Integer(500);

        Integer i2 = new Integer(500);

        Integer i3 = new Integer(400);

        System.out.println(i1==i2); // This wont be equal because this just compares the memory address not the actual value each object holds

        System.out.println(i1.equals(i2)); // This approach actually compares the values of the two objects.

        /**
         * equals
         */
        System.out.println(i2.compareTo(i1)); // returns 0 because i2 and i1 are equal.

        /**
         * i2 > i3
         */
        System.out.println(i2.compareTo(i3)); // returns 1 because i2 is greater than i3.

        /**
         * i3 < i2
         */
        System.out.println(i3.compareTo(i2)); // returns -1 because i3 is lesser than i3.


    }
}
