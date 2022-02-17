package Homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        /* Task-1
        Write a Java program that asks user to enter 2 numbers as input and print the average of the numbers.

         */

        Scanner userEntry = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int userNum1 = userEntry.nextInt();
        int userNum2 = userEntry.nextInt();
        System.out.println("The average of given 2 numbers is : " + (userNum1 + userNum2) / 2);

        // short way
        // int userNum1 =,
        // System.out.println("The average of the given 2 number is:" + ( userEntry.nextInt() + userEntry.nextInt()) / 2;

        /* Task-2
        Write a Java program that asks user to enter 2 numbers as input and print the product of the numbers.

         */

        System.out.println("Please enter 2 input numbers:");
        int num1 = userEntry.nextInt();
        int num2 = userEntry.nextInt();


        System.out.println("The product of given 2 numbers is: " + (num1 * num2));

        /* Task-3
         Write a Java program that asks user to enter 3 numbers as input and print the square of each number entered by user.
         NOTE: Square of number means number multiplied with itself

         */

        System.out.println("Please enter 3 input numbers:");
        int userInput1 = userEntry.nextInt();
        int userInput2 = userEntry.nextInt();
        int userInput3 = userEntry.nextInt();
        System.out.println("The 5 multiplied with 5 is = " + (userInput1 * userInput1) +
                "\nThe 6 multiplied with 6 is = " + (userInput2 * userInput2) +
                "\nThe 10 multiplied with 10is = " + (userInput3 * userInput3));

        // other way of task-3
        // System.out.println("The" + userInput1 + " multiplied with " + userInput1 + " is = " + (userInput1 * userInput1) +
        //                "\nThe" + userInput2 + " multiplied with " + userInput2 + " is = " + (userInput2 * userInput2) +
        //                "\nThe" + userInput3 + " multiplied with " + userInput3 + " is = " + (userInput3 * userInput3));
        //

        /* Task-4
        Write a Java program that asks user to enter 2 numbers and print the remainder of first number by second number

         */

        System.out.println("Please enter 2 numbers:");
        int user1Input = userEntry.nextInt();
        int user2Input = userEntry.nextInt();

        System.out.println("First number = " + userInput1 + "\nSecond number= " + user2Input);
        System.out.println("The remainder of 25% 8 = " + (user1Input %= user2Input));

        /* Task-5
        Write a Java program that asks user to enter 5 numbers as input and print the average of numbers.

         */

        System.out.println("Please enter 5 numbers:");
        int userEntry1 = userEntry.nextInt();
        int userEntry2 = userEntry.nextInt();
        int userEntry3 = userEntry.nextInt();
        int userEntry4 = userEntry.nextInt();
        int userEntry5 = userEntry.nextInt();
        System.out.println("The average of the given 5 number is: " + (userEntry1 + userEntry2 + userEntry3 + userEntry4 + userEntry5) / 5);

        /*Task-6
        Write a Java program that asks user to enter a number as an input and print its multiplication table up to 10.

         */

        System.out.println("Please enter a number:");
        int mulNum = userEntry.nextInt();
        System.out.println("7 * 1 = " + (mulNum * 1) +
                "\n" + mulNum + " * 2 = " + (mulNum * 2) +    // other way doing it is not hard coded anymore
                "\n7 * 3 = " + (mulNum * 3) +      //Other way  int num = 1  System.out.println(mulNum + " * " + num + " = " + (mulNum * num++);
                "\n7 * 4 = " + (mulNum * 4) +
                "\n7 * 5 = " + (mulNum * 5) +
                "\n7 * 6 = " + (mulNum * 6) +
                "\n7 * 7 = " + (mulNum * 7) +
                "\n7 * 8 = " + (mulNum * 8) +
                "\n7 * 9 = " + (mulNum * 9) +
                "\n7 * 10 = " + (mulNum * 10));

        /* Task-7
        Write a Java program that asks user to enter the side of a square as input and print square’s perimeter and area
         */

        System.out.println("Please enter side of square:");
        int areaOfSquare = userEntry.nextInt();
        System.out.println("Area of the square = " + (4 * areaOfSquare) + "\nPerimeter of square = " + (areaOfSquare * areaOfSquare));

        System.out.println("Area of the square = " + (areaOfSquare * areaOfSquare) + "\nPerimeter of square = " + (2 * (areaOfSquare * areaOfSquare)));




    }
}
