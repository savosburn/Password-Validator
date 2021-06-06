/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_same_password_wrong_case () {
        App myApp = new App();

        String password = "ABC$123";
        String expectedOutput = "I don't know you.";

        String actualOutput = myApp.generateOutput(password);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_different_password () {
        App myApp = new App();

        String password = "heLLO56";
        String expectedOutput = "I don't know you.";

        String actualOutput = myApp.generateOutput(password);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_same_password () {
        App myApp = new App();

        String password = "abc$123";
        String expectedOutput = "Welcome!";

        String actualOutput = myApp.generateOutput(password);

        assertEquals(expectedOutput, actualOutput);
    }
}