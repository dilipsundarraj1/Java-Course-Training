package com.learnJava.exception;

public class ExceptionHandledExample {

    public static void main(String[] args) {
        String s = null;

        try{
            System.out.println(s.length()); // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (NullPointerException e){
           e.printStackTrace();
            System.out.println("Exception is : " + e);
        }

        System.out.println("Calculation completed");
    }
}
