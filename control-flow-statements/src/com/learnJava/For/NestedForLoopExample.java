package com.learnJava.For;

public class NestedForLoopExample {

    public static void main(String[] args) {

        for(int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("Value of i : " + i);
                System.out.println("Value of j : " + j);
            }
        }
    }
}
