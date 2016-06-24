package com.fortunemaseko.assignment;

import java.util.Scanner;

/**
 *
 * @author fortune
 */
public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 stringExcersise = new Exercise2();
        
        Scanner input = new Scanner(System.in);
        Boolean endApp = false; // Used as a flag to terminate the app
        
        String welcomeMessage = "Welcome to Excercise 2 :: String manipulation\n\n If you enjoy reversing "
                + "words then this might be your lucky day.";
        
        String spacing = "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        
        String usageInstructions = "\nTo use the program, provide a string you would like to reverse then "
                + "press ENTER.\nYou can end the program by providing the number 1 as input.";

        System.out.println(welcomeMessage + spacing + usageInstructions + spacing);

        // Application loop
        while (!endApp) {
            System.out.print("Please enter some input: ");
            String data = input.next();

            if (data.equals("1")) {
                System.out.print("Do you really want to quit the program?[y/n]: ");
                String terminationInput = input.next();
                
                if (terminationInput.equalsIgnoreCase("y")) {
                    endApp = true;
                    System.out.println("Program terminated!");
                } 
            } else {
                System.out.println("\nThe reversed version of " + data + " is \"" + stringExcersise.reverseString(data) + "\"");
            }

        }

    }

    public String reverseString(String input) {
        
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }

        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }
}
