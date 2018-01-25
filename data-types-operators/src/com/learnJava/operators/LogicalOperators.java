package com.learnJava.operators;

/**
 * Created by z001qgd on 1/25/18.
 */
public class LogicalOperators {


    public static void main(String[] args) {

        int a =2;
        int b = 1;
        int c=3;

        if(a>b && c>b){
            System.out.println("Condition is true");
        }

        if(a>b || c<b){
            System.out.println("Condition is true");
        }

        if(!(a<b)){
            System.out.println("Condition is true");
        }


    }
}
