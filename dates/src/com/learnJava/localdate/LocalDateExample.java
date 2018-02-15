package com.learnJava.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

    public static void main(String[] args) {

        System.out.println(LocalDate.now()); // prints the current date

        LocalDate someDate =   LocalDate.of(2018, Month.MARCH,31);

        System.out.println(someDate); // prints 1990-01-01

        System.out.println(someDate.getMonth()); // prints MARCH

        System.out.println(someDate.getDayOfMonth()); // prints 31 as the day is set as 1.

        System.out.println(someDate.getDayOfWeek()); // prints SATURDAY

        System.out.println(someDate.getDayOfYear()); // prints 90


    }
}
