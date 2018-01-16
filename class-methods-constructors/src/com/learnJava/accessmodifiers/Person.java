package com.learnJava.accessmodifiers;

/**
 * Created by z001qgd on 1/16/18.
 */
public class Person {

    private String gender;
    String name;

    public Person(){

    }

    public Person(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    private String getName(){

        return this.name;
    }

    public static void main(String[] args) {

        Person dilip = new Person();
        dilip.gender="Male";
        dilip.name="dilip";

    }
}
