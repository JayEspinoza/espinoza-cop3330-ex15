/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 15 - Password Validation
 *  Create a simple program that validates user login credentials. The program must prompt the user for a username and password.
 *  The program should compare the password given by the user to a known password.
 *  If the password matches, the program should display “Welcome!” If it doesn’t match, the program should display “I don’t know you.”
 *
 *  Constraint:
 *  Use an if/else statement for this problem.
 *  Make sure the program is case sensitive.
 *
 */


package ex15;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        // Variable Initialization
        Scanner userInput = new Scanner(System.in);
        String password = "abc$123";
        String username, userpass;

        // User Input Step
        System.out.printf("What is your username? ");
        username = userInput.nextLine();

        System.out.printf("What is the password? ");
        userpass = userInput.nextLine();

        // If statement compares password
        if(password.equals(userpass)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }

    }
}
