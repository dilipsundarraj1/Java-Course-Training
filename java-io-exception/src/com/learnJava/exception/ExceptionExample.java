package com.learnJava.exception;

public class ExceptionExample {

    public static void main(String[] args) {

        String s = null;

        System.out.println(s.length()); // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        System.out.println("Length is calculated");
    }
}
