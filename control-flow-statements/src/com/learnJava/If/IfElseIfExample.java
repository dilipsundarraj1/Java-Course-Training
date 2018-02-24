package com.learnJava.If;

public class IfElseIfExample {

    public static void main(String[] args) {

        int i =5;

        if(i<0){
            System.out.println("inside if loop");
        }else if(i==5){
            System.out.println("inside first else if loop"); // executes this statement first.
        }else if(i>0){
            System.out.println("inside second else if loop");
        }else{
            System.out.println("inside else loop");
        }

    }
}
