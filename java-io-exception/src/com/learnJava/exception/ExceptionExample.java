package com.learnJava.exception;

public class ExceptionExample {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a/0); // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        System.out.println("Division is calculated");
    }
}
