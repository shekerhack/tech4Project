package homeworks;

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

        System.out.println("What is your last name?");
        String userLastName = userInfo.next();

        System.out.println("What is your age?");
        int userAge = userInfo.nextInt();

        System.out.println("What is your email address?");
        String userEmail = userInfo.next();
        userInfo.nextLine();

        System.out.println("What is your phone number?");
        String userPhoneNumber = userInfo.nextLine();

        System.out.println("What is your address?");
        String userAddress = userInfo.nextLine();

        /*User who joined this program is John Doe. John’s age is 45. John’s email address is johndoe@gmail.com, phone number (123) 123 1234, and address is 123 St Chicago IL 12345.

         */

        System.out.println("\tUser who joined this program is " + userFirstName + " " + userLastName + ". John's age is " +
                userAge + ". John's email \naddress is " + userAddress + ",phone number is " + userPhoneNumber + ", and address is \n" + userAddress + ".");


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
        String userFavoriteBook = userFavorites.nextLine();

        System.out.println("What is your favorite color?");
        String userFavColor = "\"" + userFavorites.next() + "\"";


        System.out.println("What is your favorite number");
        int userFavNumber = userFavorites.nextInt();

         /*User’s favorite book is: The Brothers Karamazov
          User’s favorite color is: Blue
          User’s favorite number is: 7

         */

        System.out.println("User's favorite book is: " + userFavoriteBook + "\nUser's favorite color is: " + userFavColor.concat("\nUser's favorite number is: " + userFavNumber));
    }
}
