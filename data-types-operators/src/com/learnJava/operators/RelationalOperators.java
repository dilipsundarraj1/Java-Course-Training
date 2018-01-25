package com.learnJava.operators;

/**
 * Created by z001qgd on 1/24/18.
 */
public class RelationalOperators {

    public static void main(String[] args) {

        /**
         *
         > -> greater than.
         >= -> greater than or equal to
         < -> Lesser than
         <= -> Lesser than or equal to
         == -> Equal to
         != -> Not equal to
         *
         */

        int a =5;
        int b =2;
        int c =5;

        if(a>b){
            System.out.println("a is greater than b");
        }


        if(a>=c){
            System.out.println("a is equal to c");
        }

        if(b<a){
            System.out.println("b is lesser than a");
        }

        if(b<=a){
            System.out.println("b is lesser than a");
        }



        if(a==c){
            System.out.println("a is equal to c");
        }

        if(a!=b){
            System.out.println("a is not equal to b");
        }



    }
}
