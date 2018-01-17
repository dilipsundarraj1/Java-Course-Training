package com.learnJava.accessmodifiers.defaultt;

/**
 * Created by z001qgd on 1/16/18.
 */
class PersonDefault {

    String gender;
    public String name;

    protected String getName(){

        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

}
