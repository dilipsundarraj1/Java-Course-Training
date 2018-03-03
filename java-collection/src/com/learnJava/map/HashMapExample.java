package com.learnJava.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void iterateHashMap(Map<Integer,String> names){

        Set<Integer> keySet = names.keySet();

        for(Integer key : keySet){
            System.out.println("Values of the HashMap are :" + names.get(key));
        }

    }

    public static void iterateHashMap_2(Map<Integer,String> names){

        for (Map.Entry<Integer,String> entry : names.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());


    }

    public static void iterateHashMap_3(Map<Integer,String> names){

        Iterator<Map.Entry<Integer, String>> itr = names.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }



    }

    public static void main(String[] args) {

        Map<Integer,String> names=new HashMap<Integer,String>();
        names.put(100,"Adam");
        names.put(101,"Steve");
        names.put(102,"Amy");

        System.out.println(names); // Prints all the key value pairs

        System.out.println(names.get(100));// pass the key, returns you the value

        names.put(99, "ABC");
        System.out.println(names);

        names.remove(102); // removes the key in the hash which is 102
        System.out.println(names);

        System.out.println("Is Key available : " + names.containsKey(100)); // returns true if the value exists.

        System.out.println("Is Value available : " + names.containsValue("Adam"));


        System.out.println("Values of the HashMap : " + names.values());

        System.out.println("Key of the HashMap : " + names.keySet());

        iterateHashMap(names);

        iterateHashMap_2(names);

        iterateHashMap_3(names);

        names.clear(); //this clears the whole hashmap
        System.out.println(names);

    }
}
