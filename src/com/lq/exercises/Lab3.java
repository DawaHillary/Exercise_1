//Using Java Flow Control
//1. Create a new class named Lab3 in the com.lq.exercises package. Ensure
//that the new Lab3 class has a main() method. This can usually be added
//automatically in the IDE when you are creating the class. Use the following as
//a guide
package com.lq.exercises;

public class Lab3 {
    public static void main(String[] args) {
        //Exercise 1: for loop
        //2. Create an array of String references named daysOfWeek and initialize it with
        //the names of the days of the week starting with Sunday.
        //3. Write a for loop to print out each element of the array. Do this two ways – the
        //first using the standard for loop, the second using the for-next construct.
        //4. Write another for loop to print out each element of the array in reverse. Note
        //that the only way this can be done is by using the standard for loop.

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //First way using standard for loop
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        //Second way using for-each loop
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

    }
}