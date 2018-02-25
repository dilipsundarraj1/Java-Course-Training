package com.learnJava.scanner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int rollno=scanner.nextInt();  // syntax to get a integer
        System.out.println("Entered Number is : " + rollno);

        System.out.println("Enter a name : ");
        String name=scanner.next(); // syntax to get a String
        System.out.println("Entered name is : " + name);

        System.out.println("Enter the price of the TV : ");
        double price=scanner.nextDouble(); // syntax to get a double
        System.out.println("Entered TV price is : " + price);


    }
}
