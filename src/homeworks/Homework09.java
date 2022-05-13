package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
        /*
        Task-1
        Write a program that asks user to enter their names
        1.Print out the length of name
        2.Find the first character in the name and print out that
        3.Find the last character in the name and print out that
        4.Find the first 3 characters in the name and print out those
        5.Find the last 3 characters in the name and print out those
        6. Check if name starts with character A (or a) or not and print messages below
            If name starts with A or a, print “You are in the club!”
            If name does not start with A or a, print “Sorry, you are not in the club”

         */

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(4));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(2,5));

        if(name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in the club!");
        }
        else{
            System.out.println("Sorry you are not in the club!");
        }

        /* Task-2
        Write a program that asks user to enter their full address
        Check if city is Chicago (or chicago) in the address
        If city is Chicago, then print “You are in the club”
        If city is Des Plaines, then print “You are welcome to join to the club”
        If city is any other city, then print “Sorry, you will never be in the club”
         */


        String address = ScannerHelper.getAStringFromUser();

        if(address.toUpperCase().contains("CHICAGO")){
            System.out.println("You are in the club!");
        }else if(address.toUpperCase().contains("DES PLAINES")){
            System.out.println("You are welcome to join to the club");
        }else{
            System.out.println("Sorry you will never be in the club!");

        }


        /* Task-3
        Write a program that asks user to enter their colors, at least 4 colors
        Check If those colors contains “red” and “green”
        If “green” is listed in favorite colors, then print “Green is in the list”
        If “red” is listed in favorite colors, then print “Red is in the list”
        If both “green” and “red” are listed in favorite colors, then print “Green and red are in the list”
        If both “green” and “red” are not listed in favorite colors, then print “Green and red are not in the list”

         */

        String colors = ScannerHelper.getAStringFromUser();

        if(colors.toUpperCase().contains("GREEN") && (colors.toUpperCase().contains("RED"))){
            System.out.println("Green and red are in the list");
        }
        else if(colors.toUpperCase().contains("GREEN")){
            System.out.println("Green in the list");

        }else if(colors.toUpperCase().contains("RED")){
            System.out.println("Red is in the list");

        }else {
            System.out.println("Green and red are not in the list");

        }

        /* Task-4
        Assume that you are given below String
        String str = “   Java is FUN   ”;

        Create 3 new Strings and assign each word from str to those new Strings
        Finally print the results as below
        Expected output:
        The first word in the str is = java
        The second word in the str is = is
        The third word in the str is = fun

        NOTE:
        Make sure that you eliminate white spaces at the beginning and at the end of words in the str.
        Make sure that you converted all words to be in lower case in your results

         */

        String str = " Java is FUN ";
        String str2 = str.trim();
        String word1 = str2.substring(0, 4).toLowerCase();
        String word2 = str2.substring(5, 7).toLowerCase();
        String word3 = str2.substring(8, 11).toLowerCase();

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);

    }
}
