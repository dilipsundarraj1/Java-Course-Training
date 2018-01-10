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

    public void breath(){ //method declaration
        System.out.println("Human is breathing with his nose");
    }


    public void see(){ //method declaration
        System.out.println("Human is breathing with his eyes");
    }

    public void punch(int minutes){ //method declaration
        System.out.println("Punch for "+ minutes + " minutes.");
    }

    public void walk(int minutes, int distance){ //method declaration
        System.out.println("Walk "+ distance + " miles " +"for "+ minutes + " minutes.");
    }


    public static void main(String[] args) {

        Human dilip = new Human();
        dilip.breath();
        dilip.see();
        dilip.punch(5);
        dilip.walk(5, 3);

    }
}
