package com.learnJava.arrays;

/**
 * Created by z001qgd on 2/8/18.
 */
public class ArrayExample {

    public static void main(String[] args) {

        int[] numArray = new int[5]; // Initialized an array of five elements, and all the elements will be 0.

        String[] strArray = new String[5]; // Initialized an array of five elements and all the elements will be null.

        numArray[0]=1; //Filling/assigns a value at index 0
        numArray[1]=3;//Filling/assigns a value at index 1
        numArray[2]=8;//Filling/assigns a value at index 2
        numArray[3]=23;//Filling/assigns a value at index 3
        numArray[4]=99;//Filling/assigns a value at index 4


        System.out.println(numArray[0]);

        for(int i : numArray)
            System.out.println(i);
    }

}
