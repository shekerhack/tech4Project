package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their favorite book name and quote
        And store answers of user in different Strings
        Finally, print the length of those Strings with proper message
         */

        Scanner inPut = new Scanner(System.in);
        System.out.println("Please enter your favorite book");
        String favBook = inPut.nextLine();

        System.out.println("Please enter your favorite quote");
        String favQuote = inPut.nextLine();

        System.out.println("The length of \"" + favBook + "\" is = " + favBook.length());
        System.out.println("The length of \"" + favQuote + "\" is = " + favQuote.length());

    }
}
