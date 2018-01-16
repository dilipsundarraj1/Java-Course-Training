package com.learnJava.accessmodifiers.privatee;

/**
 * Created by z001qgd on 1/16/18.
 */
public class PersonPrivate {

    private String gender;
    String name;

    public PersonPrivate(){

    }

    public PersonPrivate(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    private String getName(){

        return this.name;
    }

    public static void main(String[] args) {

        PersonPrivate dilip = new PersonPrivate();
        dilip.gender="Male";
        dilip.name="dilip";
        System.out.println(dilip.getName()); // Calling a private method from the same class is allowed.

    }
}
