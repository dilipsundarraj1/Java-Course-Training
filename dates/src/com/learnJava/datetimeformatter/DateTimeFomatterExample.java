package com.learnJava.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFomatterExample {

    public static void stringToLocalDateTime(){

        String now = "2018-12-09 11:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);

        System.out.println("Before : " + now);

        System.out.println("After : " + formatDateTime);

        System.out.println("After : " + formatDateTime);

    }

    public static void dateTimeToString(){
        //Get current date time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now); // prints 2018-02-15T15:05:01.100

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);// prints 2018-02-15 15:05:01

        LocalDate localDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //prints  2018/02/15

        System.out.println("formatter1 Date is : " + localDate.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MMM/dd"); //prints  2018/02/15

        System.out.println("formatter2 Date is : " + localDate.format(formatter2));// Prints 2018/Feb/15

    }



    public static void main(String[] args) {

        dateTimeToString();

        stringToLocalDateTime();
    }
}
