package com.learnJava.localtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime currentTime =  LocalTime.now();

        System.out.println( " currentTime " + currentTime); // localtime

        LocalTime newTime = LocalTime.of(22, 19);

        System.out.println("newTime : " + newTime); // prints 22:19

        LocalTime newTime1 = LocalTime.parse("15:08:58");

        System.out.println("newTime1 : " + newTime1);// prints 15:08:58

        //LocalTime newTime2 = LocalTime.parse("15:08:99"); //java.time.format.DateTimeParseException: Text '15:08:99' could not be parsed: Invalid value for SecondOfMinute (valid values 0 - 59): 99

        System.out.println(newTime1.getHour()); // prints 15
        System.out.println(newTime1.getMinute()); // prints 8
        System.out.println(newTime1.getSecond()); // prints 58



    }
}
