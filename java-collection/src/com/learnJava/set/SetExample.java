package com.learnJava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void iterateSet(Set<String> set){

        for(String s : set){
            System.out.println(s);
        }

    }

    public static void iterateSet_2(Set<String> set){

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("ABC");
        set.add("DEF");
        set.add("GHI");
        set.add("ABC");

        System.out.println(set);

        set.contains("ABC"); // returns true if the element is available in the set otherwise false.

        set.remove("ABC");

        System.out.println(set);

        Set<String> set1 = new HashSet<String>();
        set1.add("JKL");
        set1.add("MNO");

        iterateSet(set);

        set.addAll(set1);

        System.out.println(set);

        System.out.println(set.isEmpty()); // false because the set is not empty.

        set.clear();

        System.out.println(set);

    }
}
