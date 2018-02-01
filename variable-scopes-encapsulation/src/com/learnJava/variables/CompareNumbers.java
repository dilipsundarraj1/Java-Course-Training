package com.learnJava.variables;

/**
 * Created by z001qgd on 1/31/18.
 */
public class CompareNumbers {

    public int getGreaterNumberofTwo( int a , int b){

        if(a > b) {

            int greaterNumber = a; // Local Variable , declared inside a for loop.
            return greaterNumber;
        }else{
            return  -1;
        }
    }

    public static void main(String[] args) {

        CompareNumbers compareNumbers = new CompareNumbers();
        System.out.println(compareNumbers.getGreaterNumberofTwo(4,2));
        System.out.println(compareNumbers.getGreaterNumberofTwo(5,6));

    }
}
