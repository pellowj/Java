package com.company;

import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();
        /*
            Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
         */

        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        //String verb = console.readLine("Enter a verb:  ");
        //String noun = console.readLine("Enter a noun:  ");

        console.printf("%s is very %s", name, adjective);
    }
}
