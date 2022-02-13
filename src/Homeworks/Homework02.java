package Homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        /* Task-1 Write a program that asks user to enter their first name, last name, age, email address, phone number, and address in separate statements.
                  Store these data given from user in proper data types
                  And, then print the data provided by user

         */
        /* Pseudo Code:
         1. I am going to use Scanner class for creating my object.
         2. I will use the object for reading the data.
         3. Print out instructions about what we need
         4. Use next(),nextInt() method for reading
         5. Print out the userInfo.
         */

        Scanner userInfo = new Scanner(System.in);

        System.out.println("What is your name?");
        String userFirstName = userInfo.next();
        System.out.println("User first name is = " + userFirstName);

        System.out.println("What is your last name?");
        String userLastName = userInfo.next();
        System.out.println("User last name is = " + userLastName);

        System.out.println("What is your age?");
        int userAge = userInfo.nextInt();
        System.out.println("User age is = " + userAge);

        System.out.println("What is your email address?");
        String userEmail = userInfo.next();
        System.out.println("User email address is = " + userEmail);

        System.out.println("What is your phone number?");
        String userPhoneNumber = userInfo.next();
        System.out.println("User phone number is = " + userPhoneNumber);

        System.out.println("What is your address?");
        String userAddress = userInfo.next();
        System.out.println("User address is = " + userAddress);

        /* Task-2 Write a program that asks user their favorite book, color, and number in separate statements.
                  Store those data in proper data types
                  And, then print given data by user ONLY in one print statement but it should be in 3 separate lines as below
         */
        /*Pseudo Code:
         1. I am going to use Scanner class for creating my object.
         2. I will use the object for reading the data.
         3. Print out instructions about what we need
         4. Use next(),nextInt() method for reading
         5. Print out the userInfo.
         */

        Scanner userFavorites = new Scanner(System.in);
        System.out.println("What is your  favorite book?");
        String userFavoriteBook = userFavorites.next();

        System.out.println("What is your favorite color?");
        String userFavColor = "\"" + userFavorites.next() + "\"";

        System.out.println("What is your favorite number");
        int userFavNumber = userFavorites.nextInt();

        System.out.println("User favorite book is = " + userFavoriteBook + "\nUser favorite color is = " + userFavColor.concat("\nUser favorite number is = " + userFavNumber));
    }
}
