package com.learnJava.string;

/**
 * Created by z001qgd on 2/7/18.
 */
public class StirngImmutable {

    public static void main(String[] args) {

        String s="Hello"; // This creates a object in the String pool.

        s= "Hello1"; // Even though most of the characters are the same , it still creates a branch new object and does not touch the other object.
    }
}
