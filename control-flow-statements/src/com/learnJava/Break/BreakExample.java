package com.learnJava.Break;

import java.util.ArrayList;
import java.util.List;

public class BreakExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
            break; // this will break out of the for loop after the first iteration eventhough it is suppose to run for 4 times.
        }
    }
}
