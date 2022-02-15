package Homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        /* Task-1 Write a program that asks user to enter 2 numbers.
                 -Store these data in int variables
                 -First, print the numbers entered by user with proper messages as shown below
                 -And, then print the sum of the given numbers by user with a proper message as shown below
                 -Assume user enters below info
                 Expected output:
                 The number 1 entered by user is = 5
                 The number 2 entered by user is = 10
                 The sum of number 1 and 2 entered by user is = 15

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = userInput.nextInt();

        System.out.println("Please enter yor second number:");
        int secondNumber = userInput.nextInt();

        System.out.println("The number 1st entered by user is = " + firstNumber +
                "\nThe number 2nd entered by user is = " + secondNumber + "\nThe sum of number 1 and 2 entered by user is = " + (firstNumber + secondNumber));

        /* Task-2 Requirement
            -Write a program that asks user to enter 2 floating numbers.
            -Store these data in double variables
            -First, print the numbers entered by user with proper messages as shown below
            -And, then print the division of the given numbers by user with a proper message as shown below
            -Assume user enters below info
            Expected output:
            The number 1 entered by user is = 45.45
            The number 2 entered by user is = 5.0
            The division of number 1 and 2 entered by user is = 9.09

         */

        System.out.println("Please enter your third number:");
        double thirdNum = userInput.nextDouble();

        System.out.println("Please enter fourth number:");
        double fourthNum = userInput.nextDouble();

        System.out.println("The number 3rd entered by user is = " + thirdNum +
                "\nThe number 4th entered by user is = " + fourthNum + "\nThe division of number 3rd and 4th entered by user is = " + thirdNum / fourthNum);

        /* Task-3
        -Write a Java program to print the result of the following operations
        NOTE: No need for using Scanner for this task
        Test Data:
        1. 	-10 + 7 * 5
        2. 	(72+24) % 24
        3. 	10 + -3*9 / 9
        4. 	5 + 18 / 3 * 3 – (6 % 3)
         */

        int subNum = -10;
        int multNum = 7 * 5;
        System.out.println("1.  " + (subNum + multNum));

        int num1 = 72 + 24;
        int num2 = 24;
        System.out.println("2.  " + (num1 % num2));

        int num3 = 10;
        int num4 = (-3*9);
        int num5 = 9;
        System.out.println("3.  " + (num3 + num4 / num5));

        int reminder1 = 5;
        int reminder2 = (18/3) * 3;
        int reminder3 = (6 % 3);
        System.out.println("4.  " + (reminder1 + reminder2 - reminder3));

        /* Task-4
        Write a program that asks user to enter 2 floating numbers.
       -Store these data in double variables
       -First, print the numbers entered by user with proper messages as shown below
       -And, then print the sum (addition), multiplication, subtraction, division and remainder of these two numbers
       -Assume user enters below info
       Expected Output:
       The sum of the given numbers is = 34.0
       The product of the given numbers is = 240.0
       The subtraction of the given numbers is = 14.0
       The division of the given numbers is = 2.4
       The remainder of the given numbers is = 4.0

         */

        System.out.println("Please enter 01 number:");
        double num01 = userInput.nextDouble();


        System.out.println("Please enter 02 number:");
        double num02 = userInput.nextDouble();

        System.out.println("The sum of the given numbers is = " + (num01 + num02) +
                "\nThe product of the given numbers is = " + (num01 * num02) +
                "\nThe subtraction of the given numbers is = " + (num01 - num02) +
                "\nThe division of the given numbers is = " + (num01 / num02) +
                "\nThe remainder of the given numbers is = " + (num01 % num02));

        /* Task-5
        Write a Java program to print the area and perimeter of a rectangle
        NOTE: No need for using Scanner for this task. Please hard code values as given below
        Expected Output:
        The area of the rectangle = 78.75
        The perimeter of the rectangle = 36.0
         */

        double widthOfRectangle = 7.5;
        double heightOfRectangle = 10.5;
        System.out.println("The area of the rectangle = " + (widthOfRectangle * heightOfRectangle) +
                "\nThe perimeter of the rectangle = " + (2 * (widthOfRectangle + heightOfRectangle)));

        /* Task-6
        Assume that an average annual rate of salary for a Software Engineer in Test is $90k.
        Write a Java program to find how much money can a Software Engineer in Test earn in 3 years?

        NOTE: No need for using Scanner for this task. Please hard code values. Print result with a proper message as below

        Expected Output: Software Engineer in Test can earn 270000.0  in 3 years.

         */

        double aveAnnualSalary = 90_000.00;
        double threeYearEarning = aveAnnualSalary * 3;
        System.out.println("Software Engineer in Test can earn " + threeYearEarning + " in 3 years.");







    }
}
