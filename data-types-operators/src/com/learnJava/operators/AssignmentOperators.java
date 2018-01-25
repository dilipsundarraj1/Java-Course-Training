package com.learnJava.operators;

/**
 * Created by z001qgd on 1/20/18.
 */
public class AssignmentOperators {

    public static void main(String[] args) {

        int a =10;
        float f =10.63984798274f; //prints this 10.639848 -> This cuts of some of the number after the decima
        double d =10.3234234234d; //prints this 10.3234234234 -> More Precise

        System.out.println(f);
        System.out.println(d);

        int b=10;
        b+=12; // equivalent to b =b+12
        System.out.println(b); //22

        int c=10;
        c-=12; // equivalent to c =c-12
        System.out.println(c); //-2

        int e = 10;
        e*=12; // equivalent to e =e*12
        System.out.println(e);//120

        int g = 10;
        g/=5; // equivalent to g =g/5
        System.out.println(g);//2
    }
}
