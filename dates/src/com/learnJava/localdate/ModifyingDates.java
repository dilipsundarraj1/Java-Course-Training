package com.learnJava.localdate;

import java.time.LocalDate;

public class ModifyingDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2018-01-01");

        System.out.println(date1.plusMonths(2)); // prints 2018-03-01

        System.out.println(date1.minusDays(2)); // prints 2017-12-30

        System.out.println(date1.plusYears(2)); // prints 2020-01-01

        System.out.println(date1.plusWeeks(2)); // prints 2018-01-15

        System.out.println(date1.atTime(11,00)); // prints  2018-01-01T11:00 , adds the hour and time to the value.



    }
}
