package com.learnJava.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {

        System.out.println("Lets perform the arithmetic operation of two numbers.");
        System.out.println("1 : ADD\n2 : Subtract\n3 : Multiply\n4 : Divide");

        System.out.println(" Please enter an option: ");

        Scanner scanner = new Scanner(System.in);

        int selectedOption = scanner.nextInt();

        List<Integer> userInputs = new ArrayList<Integer>();

        for (int i=1;i<=2;i++){
            System.out.println("Enter number " + i + ":");
            userInputs.add(scanner.nextInt());
        }

        int result=0;

        switch (selectedOption) {
            case 1:
                System.out.println("Performing Addition");
                for(Integer i : userInputs){
                    result+=i;
                }
                break;
            case 2:
                System.out.println("Performing Subraction");
                result = userInputs.get(0) -userInputs.get(1);
                break;
            case 3:
                System.out.println("Performing Multiply");
                    result = userInputs.get(0) *userInputs.get(1);
                break;
            case 4:
                System.out.println("Performing Divide");
                    result=userInputs.get(0) /userInputs.get(1);;
                break;
            default:
                System.out.println("Selected an invalid option");
                break;
        }

        System.out.println("The result is : " + result);


    }
}
