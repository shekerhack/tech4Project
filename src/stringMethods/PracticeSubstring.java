package stringMethods;

import utilities.ScannerHelper;

//import java.util.Scanner;

public class PracticeSubstring {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence (multiple words)
    Find and print the first and the last words from the given sentence with below messages

    Test data1:
    I like Java

    Expected output:
    The first word is = I
    The last word is = Java

    Test data2:
    Today is Sunday

    Expected output:
    The first word is = Today
    The last word is = Sunday

    Many students preferring to study after the class

        First word -> 0 - indexOf(' ')
        Last word  -> lastIndexOf(' ') + 1 to the end


        First space - the last space
        Everything before the first space is my first word
        Everything after the last space is my last word
     */

        // Scanner userInput = new Scanner(System.in);
        // System.out.println("Please enter sentence:");
        // String sentence = userInput.nextLine();

        String sentence = ScannerHelper.getAStringFromUser(); // Enter a sentence

        String first = sentence.substring(0, sentence.indexOf(' '));
        String last = sentence.substring(sentence.lastIndexOf( ' ') + 1); // if you don't put + 1 it will take and print space too

        System.out.println("The first word is = " + first);
        System.out.println("The last word is = " + last);

        // Other way
        //System.out.println("The first word is = '" + first + "'");
       // System.out.println("The last word is = '" + last + "'");


    }
}
