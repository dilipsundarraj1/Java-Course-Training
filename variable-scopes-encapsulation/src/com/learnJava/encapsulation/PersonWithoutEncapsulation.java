package com.learnJava.encapsulation;

/**
 * Created by z001qgd on 2/2/18.
 */
public class PersonWithoutEncapsulation {

    public String firstName; // public accessmodifier
    public String lastName;// public accessmodifier
    public int age;// public accessmodifier

    @Override
    public String toString() {
        return "PersonWithoutEncapsulation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
