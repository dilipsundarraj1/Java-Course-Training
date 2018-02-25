package com.learnJava.exception;

public class ExceptionHandledTryCatch {

    public static void main(String[] args) {
        int a = 10;

        try{
            System.out.println(a/0);  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (ArithmeticException e){
           e.printStackTrace();
            System.out.println("Exception is : " + e);
        }

        System.out.println("Calculation completed");
    }
}
