package com.learnJava.For;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        /**
         * regular for loop
         */

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
            nameList.set(i, "adam1");
        }

        /**
         * with enhanced for loop
         */
       for(String name : nameList)
       {
           System.out.println(name);
       }

        List<String> animalList = new ArrayList<>();
        animalList.add("dog");
        animalList.add("cat");
        animalList.add("rat");

        for(String name : nameList)
            for(String animal : animalList){
                System.out.println(animal);
                System.out.println(name);
            }

    }
}
