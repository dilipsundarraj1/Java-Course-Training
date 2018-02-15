package com.learnJava.localdate;

import java.time.LocalDate;

public class ComparingDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2018-01-01");

        LocalDate date2 = LocalDate.parse("2019-01-01");

        System.out.println(date1.isAfter(date2)); // prints false date1 is before date2

        System.out.println(date1.isBefore(date2)); // prints true date1 is before date2
    }
}
