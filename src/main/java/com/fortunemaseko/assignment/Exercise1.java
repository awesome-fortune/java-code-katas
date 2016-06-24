package com.fortunemaseko.assignment;

import java.util.Scanner;

/**
 *
 * @author fortune
 */
public class Exercise1 {

    public static void main(String[] args) {
        
        Exercise1 integersExcersise = new Exercise1();
        
        Scanner input = new Scanner(System.in);
        Boolean endApp = false; // Used as a flag to terminate the app
        
        String welcomeMessage = "Welcome to Excercise 1 :: Integer investigation\n\n If you desire to be "
                + "Sherlock Holmes with integers then this is a great starting place.";
        
        String spacing = "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        
        String usageInstructions = "\nTo use the program, provide a number that you would like to investigate then "
                + "press ENTER.\nYou can end the program by providing the alphabet q as input.";

        System.out.println(welcomeMessage + spacing + usageInstructions + spacing);
        
        // Application loop
        while (!endApp) {
            System.out.print("\nPlease enter some input: ");
            String data = input.next();
            
            if (data.equals("q")) {
                System.out.print("Do you really want to quit the program?[y/n]: ");
                String terminationInput = input.next();
                
                if (terminationInput.equalsIgnoreCase("y")) {
                    endApp = true;
                    System.out.println("Program terminated!");
                } 
            } else {
                try {
                    int result = Integer.parseInt(data);
                    
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("RESULTS");
                    
                    if (integersExcersise.isEven(result)) {
                        System.out.println(result +" is an Even number :D");
                    } else {
                        System.out.println(result +" is \"NOT\" an Even number :(");
                    }
                    
                    if (integersExcersise.isPrime(result)) {
                        System.out.println(result +" is a Prime number :D");
                    } else {
                        System.out.println(result +" is \"NOT\" a Prime number :(");
                    }
                    
                    if (integersExcersise.isPalindrome(result)) {
                        System.out.println(result +" is a Palindrome  :D");
                    } else {
                        System.out.println(result +" is \"NOT\" a Palindrome :(");
                    }
                    System.out.println("+++++++++++++++++++++++++++++++");
                } catch (Exception e) {
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Something went wrong");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.err.println("Error: " + e.getMessage() + ", please provide an \"integer\" for processing!");
                }
            }
        }

        
    }

    public boolean isEven(int input) {
        return ((input % 2) == 0);
    }

    public boolean isPrime(int input) {

        if (input > 1) {
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    return false; //number is divisible so its not prime
                }
            }
            return true; //number is prime now
        }

        return false;

    }

    public boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        }
        
        int div = 1;
        
        while (input / div >= 10) {
            div *= 10;
        }
        
        while (input != 0) {
            int leftSide = input / div;
            int rightSide = input % 10;
            
            if (leftSide != rightSide) {
                return false;
            }
            
            input = (input % div) / 10;
            div /= 100;
        }
        
        return true;
    }
}
