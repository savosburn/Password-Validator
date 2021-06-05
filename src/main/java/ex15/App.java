/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex15;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static String PASSWORD = "abc$123";

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        String userPass = myApp.readPass();

        // Output
        String outputString = myApp.generateOutput(userPass);
        myApp.print(outputString);
    }

    public String readPass() {
        System.out.print("What is the password? ");
        return in.nextLine();
    }

    public String generateOutput(String userPass) {
        String outputString;

        if (userPass.equals(PASSWORD)) {
            outputString = "Welcome!";
        } else {
            outputString = "I don't know you.";
        }

        return outputString;
    }

    public void print(String output) {
        System.out.println(output);
    }
}
