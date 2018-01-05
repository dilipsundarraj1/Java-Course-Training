package com.learnJava;

/**
 * Created by z001qgd on 1/3/18.
 */
public class Person {

    public Person(){

    }

    public Person(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    String gender;
    String name;


    public static void main(String[] args) {

        Person dilip = new Person();
        dilip.gender="Male";
        dilip.name="dilip";

        Person anshu = new Person();

        anshu.gender="Female";
        anshu.name="Anshu";


        Person hema = new Person();
        hema.gender="Female";
        hema.name="Hema";

        Person scooby = new Person("male", "Scooby");



    }
}
