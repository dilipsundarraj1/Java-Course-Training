package com.learnjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger =
            LoggerFactory.getLogger(Calculator.class);


    public int performAddition(List<Integer> input){

        int result =0;
        for(Integer i : input){
            result+=i;
        }

        return result;

    }

    public List<Integer> getUserInputs(Scanner scanner){
        List<Integer> userInputs = new ArrayList<Integer>();

        for (int i=1;i<=2;i++){
            //System.out.println("Enter number " + i + ":");
            logger.info("Enter number " + i + ":");
            userInputs.add(scanner.nextInt());
        }
        return userInputs;
    }

    public static void main(String[] args) {

        System.out.println("Lets perform the arithmetic operation of two numbers.");

        Calculator calculator = new Calculator();

        while(true){
            System.out.println("1 : ADD\n2 : Exit");

            System.out.println(" Please enter an option: ");

            Scanner scanner = new Scanner(System.in);

            int selectedOption = scanner.nextInt();


            if(selectedOption==2){
                System.out.println("Exiting the Program.\n Bye !!");
                System.exit(0);
            }


            int result=0;

            switch (selectedOption) {

                case 1:
                    System.out.println("Performing Addition");
                    List<Integer> userInputs = calculator.getUserInputs(scanner);
                    result = calculator.performAddition(userInputs);
                    break;
                default :
                    System.out.println("Please enter the correct option.");
                    break;

            }
            logger.info("Result is : " + result);

            }





    }
}
