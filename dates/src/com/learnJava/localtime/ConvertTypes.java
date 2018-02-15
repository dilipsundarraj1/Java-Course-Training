package com.learnJava.localtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertTypes {

    public static void main(String[] args) {


        LocalTime time = LocalTime.of(22, 11, 0);
        LocalDate date = LocalDate.of(2018,02,11);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime); // prints 2018-02-11T22:11 , it combines both date and time.

    }
}
