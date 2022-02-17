package Homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        /* Task-1
        Write a Java program that asks user to enter 3 numbers - int values and find the Max and Min numbers by using Math.max() and Math.min() methods

         */

         Scanner userData = new Scanner(System.in);

        System.out.println("Please enter 3 different numbers:");
        int num1 = userData.nextInt(), num2 = userData.nextInt(), num3 = userData.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(num1, num2), num3));
        System.out.println("Min value = " + Math.min(Math.min(num1, num2), num3));

        /* Task-2
        Write a Java program that asks user to enter 5 numbers - int values and find the Max and Min number by using Math.max() and Math.min() methods
         */

         System.out.println("Please enter 5 numbers:");
        int userNum1 = userData.nextInt(), userNum2 = userData.nextInt(), userNum3 = userData.nextInt(), userNum4 = userData.nextInt(), userNum5 = userData.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(userNum1, userNum2), userNum3 + Math.max(userNum4, userNum5)));
        System.out.println("Min value = " + Math.min(Math.min(userNum1, userNum2), userNum3 + Math.min(userNum4,userNum5)));

        /* Task-3
        Write a Java program that asks user to enter 2 numbers - int values and find the absolute difference between the two numbers by using Math.abs() method
         */
        System.out.println("Please enter two numbers:");
        int userEntry1 = userData.nextInt(), userEntry2 = userData.nextInt();
        System.out.println("The difference between two numbers is = " + Math.abs(userEntry1 - userEntry2));

        /*Task-4
        Write a Java program that generates 3 random numbers between 50 and 100 both included. Use Math.random()
        First print the numbers
        Then, find the sum of these numbers

         */

        int random1 = (int) (Math.random() * 51) + 50, random2 = (int) (Math.random() * 51) + 50, random3 = (int) (Math.random() * 51) + 50;
        System.out.println("Number 1 = " + random1 +
                "\nNumber 2 = " + random2 +
                "\nNumber 3 = " + random3 +
                "\nThe sum of numbers is = " + (random1 + random2 + random3));

        /* Task-5
        Assume Alex has $125, and Mike has $220.
        And Alex is going to give $25.5 to Mike.
        Then,How much money will Alex and Mike will have after that?

         */

        double alexBalance = 125;
        double mikeBalance = 220;

        System.out.println("Alex's money: $" + (alexBalance - 25.50) +
                "\nMike's money: $" + (mikeBalance + 25.50));

        /* Task-6
        Assume David is going to save  $390 to buy a bicycle.
        David can save only $15.60 per day.
         */

        double davidBicycleSaving = 390;
        double davidSavingPerDay = 15.60;
        System.out.println(davidBicycleSaving / davidSavingPerDay);






    }
}
