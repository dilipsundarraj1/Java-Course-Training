package com.learnJava.encapsulation;

/**
 * Created by z001qgd on 2/2/18.
 */
public class PersonClient {

    public static void main(String[] args) {

        PersonWithoutEncapsulation person1 = new PersonWithoutEncapsulation();
        person1.age=-10; // This allows a negative value for a age which is not correct.
        person1.firstName="xyz";
        person1.lastName="abc";

        System.out.println(person1);

        PersonWithEncapsulation person2 = new PersonWithEncapsulation();

        //person2.age=-10; //Not accessible, so that we can set the value as -10 for a age which is not a valid scenario.

        person2.setAge(-10);
        person2.setFirstName("xyz");
        person2.setFirstName("abc");

        System.out.println(person2);


    }
}
