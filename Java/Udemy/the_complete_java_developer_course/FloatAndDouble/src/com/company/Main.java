package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 3;
	    float myFloatValue = 5f / 3f;
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        /*

        Challenge:  Convert a given number of pounds to kilograms

        1.  Create a variable to store the number of pounds
        2.  Calculate the number of Kilograms for a number above and store in a variable
        3.  Print out the result

        Notes: 1 pound is equal to 0.45359237 Kilograms

         */

        int pounds = 200;
        double poundsToKilo = pounds * 0.45359237;

        System.out.println(pounds + " pound/s = " + poundsToKilo + " Kilograms");

    }
}
