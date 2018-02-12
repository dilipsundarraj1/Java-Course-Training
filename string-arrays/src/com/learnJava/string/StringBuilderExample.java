package com.learnJava.string;

/**
 * Created by z001qgd on 2/12/18.
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hi");
        str.append(" Hello");

        System.out.println(str.toString()); // prints "Hi Hello"
    }
}
