package com.learnJava.If;

import com.learnJava.Car;

import java.util.ArrayList;

public class IfElseExample {

    public static void main(String[] args) {

        int i =9 ;
        if(i>0){ //the result of the expression is a boolean. If the boolean returns true it executes the if loop
            System.out.println("inside the if loop"); // prints if loop
        }

        if(i>10){
            System.out.println("inside the if loop");
        }else{
            System.out.println("inside else loop"); // prints else loop

        }

        /**
         * Comparing Strings
         */
        String name= "ABC";

        if(name.equals("ABC")){
            System.out.println("inside if loop"); // prints, inside if loop
        }

        if(name.equals("ABC")){
            System.out.println("inside if loop"); // prints, inside if loop
        }

        /**
         * ArrayList
         */

        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Lion");

        if(animalList.contains("Cat")){
            System.out.println("inside the if loop"); // prints , inside the if loop
        }

        /**
         * User Defined Object
         */

        Car car1 = new Car("camry", "abc", 2015);

        if(car1.getYear()==2015 && car1.getModel().equals("camry")){
            System.out.println("Inside the if loop");
        }
    }
}
