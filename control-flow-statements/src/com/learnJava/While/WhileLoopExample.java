package com.learnJava.While;

public class WhileLoopExample {

    public static void main(String[] args) {

        int count=1;

        while(count<=3){
            System.out.println("Inside while");
            count+=1;
        }

        int num=5;

        do{
            System.out.println("Inside the do loop");
        }while(num>5);
    }
}
