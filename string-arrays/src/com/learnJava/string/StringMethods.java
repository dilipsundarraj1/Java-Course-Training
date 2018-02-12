package com.learnJava.string;

/**
 * Created by z001qgd on 2/9/18.
 */
public class StringMethods {

    public static void main(String[] args) {

        String str = "Dilip";

        String str1 = "hello ";
        System.out.println(str.equals(str1)); // output as "true"

        System.out.println(str.concat(" Dilip")); // output as "Dilip Dilip"
        System.out.println(str.charAt(0)); // prints "D" in the console.
        System.out.println(str.charAt(2)); // prints "l" in the console.


        System.out.println(str.length()); // prints "5" in the console.

        System.out.println(str.contains("D")); // true, since D is part of the String itself else this will return false.

        System.out.println(str.isEmpty()); // this returns false because str stores the name "Dilip". If the name s empty then this will return false.

        System.out.println(str.replace('i','o')); // this returns "Dolop"

        System.out.println(str.substring(2,4)); // this returns "li"

        System.out.println(str.indexOf(0)); // this will print "D".


        System.out.println(str1.trim()); // prints "hello" , this is used to remove the white spaces in the String.

        System.out.println(str1.startsWith("he")); // prints true

        System.out.println(str1.startsWith("el")); // prints false

        System.out.println(str1.endsWith("lo")); // prints true

        System.out.println(str1.endsWith("el")); // prints false

        System.out.println(str1.trim().replace("l","o")); // prints heooo, calling two methods in a single line trom and replace.

        System.out.println("String concat : " + str+str1);// prints Diliphello. This does not change the value of the actual String.


    }

}
