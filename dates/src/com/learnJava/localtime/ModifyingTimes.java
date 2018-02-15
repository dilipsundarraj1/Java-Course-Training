package com.learnJava.localtime;

import java.time.LocalTime;

public class ModifyingTimes {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(19,45,31);

        System.out.println("localTime : " + localTime);

        System.out.println(localTime.minusMinutes(2)); // prints 19:43:31

        System.out.println(localTime.plusHours(2)); // prints 21:43:31

        System.out.println(localTime.plusSeconds(10)); // prints 21:43:41

    }
}
