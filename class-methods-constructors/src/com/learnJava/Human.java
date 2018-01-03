package com.learnJava;

/**
 * Created by z001qgd on 1/3/18.
 */
public class Human {

    String name;
    String nose;
    String hands;
    String legs;
    String eyes;

    public void breath(){
        System.out.println("Human is breathing with his nose");
    }


    public void see(){
        System.out.println("Human is breathing with his eyes");
    }


    public static void main(String[] args) {

        Human dilip = new Human();
        dilip.breath();
        dilip.see();

    }
}
