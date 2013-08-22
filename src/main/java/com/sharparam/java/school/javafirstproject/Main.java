package com.sharparam.java.school.javafirstproject;

/**
 * User: Sharparam
 * Date: 2013-08-22
 * Time: 16:00
 */
public class Main {
    public static void main(String[] args) {
        // Let's print some text to the default output stream!
        System.out.println("Hello, World!");

        // We'll define an integer and assign the value 1 to it.
        int number = 1;

        // Print the value to the console
        System.out.println(number); // Should print "1"

        // Let's add 1
        number = number + 1; // number now equals 2
        // Which can also be written:
        number += 1; // number now equals 3
        // or:
        number++; // number now equals 4

        // Print out the new value!
        System.out.println(number); // Should print "4"
    }
}
