/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_two_options () {
        App myApp = new App();

        String password = "ABC$123";
        String expectedOutput;

        if (password.equals("abc$123")) {
            expectedOutput = "Welcome!";
        } else {
            expectedOutput = "I don't know you." ;
        }

        String actualOutput = myApp.generateOutput(password);

        assertEquals(expectedOutput, actualOutput);
    }
}