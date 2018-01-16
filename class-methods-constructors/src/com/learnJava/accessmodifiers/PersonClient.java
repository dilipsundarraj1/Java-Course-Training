package com.learnJava.accessmodifiers;

import com.learnJava.accessmodifiers.privatee.PersonPrivate;

/**
 * Created by z001qgd on 1/16/18.
 */
public class PersonClient {

        public static void main(String[] args) {

            PersonPrivate person = new PersonPrivate("male", "Scooby");
            //System.out.println(person.getName());
    }
}
