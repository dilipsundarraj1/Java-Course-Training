package com.learnJava.wrapper;

/**
 * Created by z001qgd on 1/26/18.
 */
public class CharacterExample {

    public static void main(String[] args) {
        Character c = new Character('C');
        System.out.println(c);

        Character c1 = 'D';
        System.out.println(c1);

        Character c2 = Character.valueOf('D');
        System.out.println(c2);

        /**
         * c=76
         * c1=68
         * c2=68
         */
        System.out.println(c1.compareTo(c)); // 1
        System.out.println(c.compareTo(c1)); //-1
        System.out.println(c1.compareTo(c2)); // 0




        System.out.println(c1 == c2); // false
        System.out.println(c1.equals(c2)); // true


    }
}
