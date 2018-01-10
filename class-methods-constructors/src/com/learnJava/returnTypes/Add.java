package com.learnJava.returnTypes;

/**
 * Created by z001qgd on 1/8/18.
 */
public class Add {

    public int addTwoNumbers() {

        return 1+2;
    }

    public String operation(){

        return "ADD";
    }

    public static void main(String[] args) {

        Add add = new Add();

        int sum = add.addTwoNumbers(); // Method invocation
        System.out.println(sum); // printing a value
        String operation = add.operation(); // Method invocation
        System.out.println(operation); // printing a value

    }
}
