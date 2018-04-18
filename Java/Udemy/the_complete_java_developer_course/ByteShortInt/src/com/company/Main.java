package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2_147_483_648; // literal is the number on the end (fixed number)
        int myMaxValue = 2_147_483_647; // width of 32
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        byte myByteValue = -128; // -128 to 127 --- width of 8
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myByteValue = " + myNewByteValue);

        short myShortValue = -32768; // -32768 to 32767 --- width of 16
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myShortValue = " + myByteValue);

        long myLongValue = -9_223_372_036_854_775_808L; // long has a width of 64 --- max is positive -1



        /* test

        1.  Create a byte variable and set it to any valid byte number
        2.  Create a short variable and set it to any valid short number
        3.  Create a int variable and set it to any valid int number
        4.  Create a variable type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short, plus the int

        */

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + 10 * (myByte + myShort + myInt);

        System.out.println("Total of myLong = " + myLong);
    }
}
