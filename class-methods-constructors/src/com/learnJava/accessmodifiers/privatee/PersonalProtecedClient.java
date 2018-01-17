package com.learnJava.accessmodifiers.privatee;

import com.learnJava.accessmodifiers.protectedd.PersonProtected;

/**
 * Created by z001qgd on 1/17/18.
 */
public class PersonalProtecedClient {

    public static void main(String[] args) {

        PersonProtected personProtected = new PersonProtected();
        personProtected.name;// Not accessible,compilation issue
        personProtected.getGender();
        personProtected.getName();// Not accessible,compilation issue
    }
}
