package com.company;

public class Example {

    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n",
                            PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is Empty");
        }

        System.out.println("Filling the dispenser with delicious PEZ...");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }

        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("Chomp!!");
        }

        try {
            dispenser.fill(400);
            System.out.println("You should never see this line print out...");
        } catch (IllegalArgumentException e) {
            System.out.println("Whoa there!");
            System.out.printf("The error were %s %n", e.getMessage());
        }
    }
}
