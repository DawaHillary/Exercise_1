package com.lq.exercises;

import javax.sound.sampled.Line;

public class ChallengeExercise {
    public static void main(String[] args) {
        //Challenge Exercise
        //12.Create the necessary variables, loops and flow control to print March as a
        //calendar. The calendar will have:
        //a. A heading with the days of the week
        //b. 5 rows with the days of the month in the correct column
        //c. Assume that March 1 starts on a Friday
        //d. Each week on the calendar should flow from Sunday – Saturday
        //(left to right).
        //e. You can use the function System.out.print() to print
        //information to the console without adding a carriage return.


        int year = 2024;
        int daysInMonth = 31;
        int startDayOfWeek = 6;

        System.out.println("March " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d", i);

            if ((i + startDayOfWeek) % 7 == 0) {
                System.out.println();
            }


        }

        System.out.println("-----------------------------");


    }

}
