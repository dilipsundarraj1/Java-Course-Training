package com.learnJava.Switch;

public class SwitchvsIfExample {

    public static void main(String[] args) {

        String day = "SUN";
        if (day.equals("MON") || day.equals("TUE")||
                day.equals("WED") || day.equals("THU"))
            System.out.println("Time to work");
        else if (day.equals("FRI"))
            System.out.println("Nearing weekend");
        else if (day.equals("SAT") || day.equals("SUN"))
            System.out.println("Weekend!");
        else
            System.out.println("Invalid day?");


        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU": System.out.println("Time to work");
                break;
            case "FRI": System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN": System.out.println("Weekend!");
                break;
            default: System.out.println("Invalid day?");
        }

    }
}
