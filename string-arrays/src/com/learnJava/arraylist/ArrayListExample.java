package com.learnJava.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by z001qgd on 2/12/18.
 */
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        /**
         * adding the elements using the add method
         */
        names.add("ADAM");
        names.add("Dan");
        names.add("Alex");
        names.add("ADAM");

        System.out.println(names.lastIndexOf("ADAM")); // prints 3
        System.out.println("list is " + names); // prints //[ADAM, Dan, Alex]

        System.out.println(names.indexOf("Dan")); // prints 1

        System.out.println(names.indexOf("abc")); // prints -1

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Amy");
        names2.add("Jenny");
        names2.add("Jack");

        names.addAll(names2);

        System.out.println("new list is " + names); // prints [ADAM, Dan, Alex, Amy, Jenny, Jack]

        /**
         * Using the for loop
         */
        for (String str : names){  // for(Type <variable-name> : arrayList){
            System.out.println(str); //System.out.println(str);
                                     //}
        }

        /**
         * Getting the elements using Iterator
         */
        ListIterator<String>  iterator  = names.listIterator();
        while ((iterator.hasNext())){ // does it have any elements
            System.out.println(iterator.next()); // fetches the next element in the arrayList.
        }

        names.set(0,"Micheal");


        System.out.println("modified list is  : " + names);

      //  names.remove("Dan"); // This removed the element "Dan" from the list.

        names.remove(1); //This removes the value in the  1st index.

        System.out.println("new list is  : " + names);// prints [Micheal, Alex]

        names.clear();

        System.out.println("New list is : "+ names);// prints []





    }
}
