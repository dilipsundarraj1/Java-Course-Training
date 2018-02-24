package com.learnJava.Switch;

public class SwitchExample {

    public static void main(String[] args) {

        String name="ghi";

        switch (name){ // takes in the condition
            case "abc": //this should be of type String/.
                System.out.println("inside abc ");
                break;
            case "def":
                System.out.println("inside ghi ");
                break;
            case "ghi":
                System.out.println("inside ghi ");
                //missing break
            case "jkl":
                System.out.println("inside jkl ");
                //missing break
            default:
                System.out.println("inside default ");
                break;


        }

    }
}
