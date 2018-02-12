package com.learnJava.string;

/**
 * Created by z001qgd on 2/12/18.
 */
public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("Hi");
        str.append(" Hello");
        System.out.println(str.replace(2,4, "how"));// prints "Hihowello", replaces the characters between  2 and 3

        System.out.println(str.toString()); // prints "Hi Hello"



        str.deleteCharAt(1); // Remove the character at the first index. Index always starts from 0 and ends with length-1.

        System.out.println(str.toString()); // prints "H Hello"

        str.insert(1,'i');// Adds the character i at the index 1.

        System.out.println(str.toString()); // prints "Hi Hello"

        System.out.println(str.reverse()); // prints olleH iH

        System.out.println(str.toString());// olleH iH

        System.out.println(str.replace(2,4, "how"));



    }
}
