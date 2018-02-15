package com.learnJava.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime dateTimeNow = LocalDateTime.now();

        System.out.println("current date time of the machine is : " + dateTimeNow); // prints the machines current date and time . Eg.,2018-02-15T14:50:15.678


        LocalDateTime dateTimeNow1 = LocalDateTime.parse("2018-11-09T11:00:45");

        System.out.println(dateTimeNow);
    }
}
