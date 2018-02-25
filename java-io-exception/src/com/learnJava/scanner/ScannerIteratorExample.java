package com.learnJava.scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerIteratorExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> nameList = new ArrayList<>();

        for (int i=0;i<3;i++){
            System.out.println(" Please Enter a name  : ");
            nameList.add(scanner.next());
        }

        System.out.println("Entered names are : " + nameList);
    }
}
