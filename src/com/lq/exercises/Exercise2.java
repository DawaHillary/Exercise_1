package com.lq.exercises;

public class Exercise2 {
    public static void main(String[] args) {

        //Exercise 2: while loop and continue
        //5. Create a while loop that will print out only even numbers between 1 and 20.
        //6. Use the continue statement and an if statement to skip printing the odd
        //numbers (i.e. increment the counter by 1 each time through the loop).

        int number = 1;

        while (number <= 20) {
            if (number % 2 != 0) {
                number++;
                continue;
            }

            System.out.println(number);
            number++;

        }
    }

}
