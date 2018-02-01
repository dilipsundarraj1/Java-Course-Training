package com.learnJava.variables;

/**
 * Created by z001qgd on 1/31/18.
 */
public class Addition {

    public int addition(int a , int b){ // method parameters and this is just visible to this method

        int sum =0; // local variable, scope of this variable is just visiable to this method.
        sum = a+b;
        return sum;

    }

    public int addingThreenumbers(int x , int y, int z){ // method parameters and this is just visible to this method

    //  a + b // You cannot access a and b variable of the addition method in here.

        return x+y+z;
    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        int total = addition.addition(2,3);
        System.out.println("Total is : " + total);

    }
}
