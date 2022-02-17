package Homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        /* Task-1
        Convert given Strings below to int data types and find their sum, product, division, subtraction and remainder.

         */

        String s1 = "5", s2 = "10";

        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);

        System.out.println("-Sum of 5 an 10 is = " + (s1Int + s2Int));
        System.out.println("-Product of 5  and 10 is = " + (s1Int * s2Int));
        System.out.println("-Division of 5 and 10 is = " + (s1Int / s2Int));
        System.out.println("-Subtraction of 5 and 10 is = " + (s1Int - s2Int));
        System.out.println("Remainder of 5 and 10 is = " + (s1Int % s2Int));

        /* Task-2
        Convert given Strings below to int data types and find the greatest and smallest values and find the average and absolute difference of them.

         */

        String num1 = "200", num2 = "-50";

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        System.out.println("The greatest value is = " + Math.max(num1Int, num2Int) +
                "\nThe smallest value is = " + Math.min(num1Int, num2Int) +
                "\nThe average is = " + (num1Int + num2Int) / 2 +
                "\nThe absolute difference is = " + Math.abs(num1Int - num2Int));

        /* Task-3
        Requirement:
         Assume that you have a coin bank, and you save 3 quarters, 1 dime, 2 nickels and 1 penny each day.
         NOTE: Scanner is not needed for this task!
        -find how many days later you can save $24
        -find how many days later you can save $168
        -how much you will save after 5 months (assume a month is 30 days)
         */


        double saving1 = (3 * 0.25) + 0.10 + (2 * 0.05) +0.01; //0.96

        System.out.println((int)(24 / saving1) + " days" +
                "\n" + (int)(168 / saving1) + " days" +
                "\n$" + (5 * 30 * saving1));


        /* Task-4
        Jessie is going to save $1,250 to buy a new computer. Jessie is saving $62.5 in a day.
        Write a Java program that calculates how many days it will take for Jessie to but the computer.
        NOTE: Scanner is not needed for this task!
         */

        int computerSaving = 1250;
        double savingPerDay = 62.50;
        int savingADay = (int) (savingPerDay);

        System.out.println(computerSaving / savingADay);


        /* Task-5
        Dan is going to save $14,265 to buy a new car. Dan is given two option to make monthly payments with no interest rate.
       Option 1: Equal payments of $475.50 per month
       Option 2: Equal payments of $951 per month
       Write a Java program that calculates how many months it will take for Dan to complete all the payments with option 1 and option 2.
       NOTE: Scanner is not needed for this task!
       Expected Output:Option 1 will take 30 months
       Option 2 will take 15 months
       NOTE: 15 or 30 months are int results and do not have any floating point. So, it should not be 15.0 or 30.0 which are double

         */

        int newCar = 14265;
        double option1PerMonthPayment = 475.50;
        int  option2PerMonthPayment = 951;
        int option1 = (int) (option1PerMonthPayment);

        System.out.println("Option 1 will take " + (newCar / option1) + " months" +
                "\nOption 2 will take " + (newCar / option2PerMonthPayment) + " months");

        /* Task -6
        Write a Java program that asks user to enter 2 numbers(number1 and number2) and store those in int variables.
        Find the result of number1/number2 and store this in a double.
        Finally, print the result
        Test data:
        Number1 = 15
        Number2 = 2
        Expected Output:7.5
        NOTE: 7.5 is a double or float but you are asked to store the result in a double. Make sure that your result is not returning 7 instead of 7.5

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int userNum1 = userInput.nextInt(), userNum2 = userInput.nextInt();
        double dNum1 = (double) (userNum1), dNum2 = (double) (userNum2);

        System.out.println(dNum1 / dNum2);






    }
}
