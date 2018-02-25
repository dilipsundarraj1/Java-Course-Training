package com.learnJava.exception;

public class ExceptionTryFinally {

    public static void main(String[] args) {

        int a = 10;

        try{
            int b = a/0;  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }finally {
            System.out.println("Calculation completed");
        }
    }
}
