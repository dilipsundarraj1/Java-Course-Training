package com.learnJava.Continue;

public class ContinueExample {

    public static void main(String[] args) {

        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name : programmers) {
            if (name.equals("Shreya"))
                continue;
            System.out.println(name);  // Shreya wont get printed but it wont ex
        }

    }
}
