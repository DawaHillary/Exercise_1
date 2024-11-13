package com.lq.exercises;

public class Exercise3 {
    public static void main(String[] args) {

        //Exercise 3: for loop
        //7. Create a for loop that will print out all numbers between 1 and 100 except 50
        //thru 60
        for (int i = 1; i <= 100; i++) { // Loop from 1 to 100
            if (i >= 50 && i <= 60) { // Skip numbers between 50 and 60
                continue;
            }
            System.out.println(i);
        }


    }
}
