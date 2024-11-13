package com.lq.exercises;

public class Exercise4 {
    public static void main(String[] args) {


        //Exercise 4: switch statement
        //8. Create a while loop that will execute the following code 12 times using a
        //counter that starts at 1 and is incremented by 1 each time through the loop.
        //9. Within the while loop, create a switch statement that will print out the number
        //of days in each of the months of the year.
        //10.Use fall through capabilities so that you only have one print statement for all
        //of the months that contain 31 days. Do not worry about leap years.
        //11. Print out the name of the month as well. You can copy and paste your
        //monthNames array from the previous lab to help make this easier.

        int counter = 1;
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        while (counter <= 12) {
            switch (counter) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Month: " + monthNames[counter - 1] + ", Days: 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Month: " + monthNames[counter - 1] + ", Days: 30");
                    break;
                case 2:
                    System.out.println("Month: " + monthNames[counter - 1] + ", Days: 28");
                    break;
            }
            counter++;


        }
    }
}
