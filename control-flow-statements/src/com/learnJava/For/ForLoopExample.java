package com.learnJava.For;

public class ForLoopExample {

    public static void main(String[] args) {

        /**
         * Forward for loop
         */
        for(int i=0;i<5;i++){
            System.out.println("Value of i : " + i);
        }

        /**
         * BackWard for loop
         */

        for(int i=5;i>0;i--){
            System.out.println("Value of i : " + i);
        }

        for(int i=5;;i--){
            System.out.println("Value of i : " + i);
        }
    }
}
