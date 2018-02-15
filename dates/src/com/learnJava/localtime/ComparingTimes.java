package com.learnJava.localtime;

import java.time.LocalTime;

public class ComparingTimes {

    public static void main(String[] args) {

        LocalTime  localTime = LocalTime.of(22,33,41);

        LocalTime  localTime1 = LocalTime.of(11,45,12);

        System.out.println(localTime.isAfter(localTime1)); // prints true

        System.out.println(localTime1.isAfter(localTime)); // prints false
    }

}
