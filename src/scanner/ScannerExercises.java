package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {
        /*  Pseudo Code.
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading the data.

        1. Create an object af scanner (import)
        2. Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the first and last name in one statement.
         */

        Scanner info = new Scanner(System.in);

        System.out.println("What is your first name?");
        String myName = info.next();
        System.out.println("My name is =" + " " + myName);

        System.out.println("What is your last name?");
        String myLastName = info.next();
        System.out.println("My last name is =" + myLastName);


        System.out.println("First name and last name of the user is =" +myName + "\t" + myLastName);

        /* Write a Java program that reads the full address from user print the address.
         */
        /*Pseudo Code:

         /* 1. Create an object af scanner (import)
            2. Print out instructions about what we need
            3. Use next() method for reading
            4. Print out the address.
         */

        Scanner address = new Scanner(System.in);

        System.out.println("What is your address");
        String userAddress = address.nextLine();
        System.out.println("My address is =" + userAddress);

        /*
        Write Java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */
        /* Pseudo Code
        1. Create an object
        2.

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = userInput.nextInt();

        System.out.println("Second number:");
        int num2 = userInput.nextInt();

        System.out.println("Third number:");
        int num3 = userInput.nextInt();

        System.out.println("Sum of the number is = " + (num1 + num2 + num3));



    }
}
