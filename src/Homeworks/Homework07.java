package Homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        /*Task-1
        Write a program that generates 4 random numbers between 0 and 10 (0 and 10 are also included).
      -Store numbers in proper variables and print them first
      -Print each number’s absolute difference with 5
      -Find greatest and print the result with a proper message
      -Find smallest and print the result with a proper message
       NOTE: Assume random numbers came as 2, 5, 3, 0 respectively.

       EXPECTED RESULT:
      Number 1 = 2
      Number 2 = 5
      Number 3 = 3
      Number 4 = 0
      Absolute difference of 2 with 5 is = 3
      Absolute difference of 5 with 5 is = 0
      Absolute difference of 3 with 5 is = 2
      Absolute difference of 0 with 5 is = 5
      Greatest number is = 5
      Smallest number is = 0

         */


        int random0And10Included1 = (int) (Math.random() * 11);
        System.out.println("Number 1 = " + random0And10Included1);
        int random0And10Included2 = (int) (Math.random() * 11);
        System.out.println("Number 2 = " + random0And10Included2);
        int random0And10Included3 = (int) (Math.random() * 11);
        System.out.println("Number 3  = " + random0And10Included3);
        int random0And10Included4 = (int) (Math.random() * 11);
        System.out.println("Number 4 = " + random0And10Included4);

        int num = 5;

        int abs1 = Math.abs(random0And10Included1 - num);
        System.out.println("Absolute difference of 2 with 5 is = " + abs1);
        int abs2 = Math.abs(random0And10Included2 - num);
        System.out.println("Absolute difference of 5 with 5 is = " + abs2);
        int abs3 = Math.abs(random0And10Included3 - num);
        System.out.println("Absolute difference of 3 with 5 is = " + abs3);
        int abs4 = Math.abs(random0And10Included4 - num);
        System.out.println("Absolute difference of 0 with 5 is = " + abs4);

        int max = Math.max(Math.max(abs1, abs2), Math.max(abs3, abs4));
        int min = Math.min(Math.min(abs1, abs2), Math.min(abs3, abs4));
        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);


        /*Task-2
        Write a program that generates 8 random int numbers between -50 and 50 (-50 and 50 are included)
       -Store numbers in proper variables and print them first
       -Find greatest and print the result with a proper message
       -Find smallest and print the result with a proper message
       -Find average of all 8 numbers and print result with a proper message
       -Find the absolute difference between smallest and greatest and print result with a proper message
       -Print true if 3rd number is positive, false otherwise with a proper message
       -Print true if 5th number is negative, false otherwise with a proper message
       -Print true if any of the numbers is zero, false otherwise with a proper message
       NOTE: Assume random numbers came as -10, 5, -37, 13, 50, -39, 17, 3 respectively.
       NOTE: Your result will be different based on the random numbers you will get.

       EXPECTED RESULT:
      Number 1 = -10
      Number 2 = 5
      Number 3 = -37
      Number 4 = 13
      Number 5 = 50
      Number 6 = -39
      Number 7 = 17
      Number 8 = 3
      Greatest number is = 50
      Smallest number is = -39
      Average of 8 numbers is = 1
      Absolute difference between smallest and greatest is = 89
      3rd number is positive = false
      5th number is negative = false
      There is at least one zero among those numbers is = false

         */

        int random_50And50Included1 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 1 = " + random_50And50Included1);
        int random_50And50Included2 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 2 = " + random_50And50Included2);
        int random_50And50Included3 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 3 = " + random_50And50Included3);
        int random_50And50Included4 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 4 = " + random_50And50Included4);
        int random_50And50Included5 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 5 = " + random_50And50Included5);
        int random_50And50Included6 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 6 = " + random_50And50Included6);
        int random_50And50Included7 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 7 = " + random_50And50Included7);
        int random_50And50Included8 = (int) (Math.random() * 101) - 50;
        System.out.println("Number 8 = " + random_50And50Included8);

        int max1 = Math.max(Math.max(Math.max(random_50And50Included1, random_50And50Included2), Math.max(random_50And50Included3, random_50And50Included4)),
                Math.max(Math.max(random_50And50Included5, random_50And50Included6), Math.max(random_50And50Included7, random_50And50Included8)));
        System.out.println("Greatest number is = " + max1);

        int min1 = Math.min(Math.min(Math.min(random_50And50Included1, random_50And50Included2), Math.min(random_50And50Included3, random_50And50Included4)),
                Math.min(Math.min(random_50And50Included5, random_50And50Included6), Math.min(random_50And50Included7, random_50And50Included8)));
        System.out.println("Smallest number is = " + min1);

        System.out.println("Average of 8 numbers is = " + (random_50And50Included1 + random_50And50Included2 + random_50And50Included3 +
                random_50And50Included4 + random_50And50Included5 + random_50And50Included6 + random_50And50Included7 + random_50And50Included8) / 8);

        int abs = Math.abs(min1 - max1);
        System.out.println("Absolute difference between smallest and greatest is = " + abs);

        boolean rand1Num3 = (random_50And50Included3 > 0);
        boolean rand1Num5 = (random_50And50Included5 < 0);

        if (rand1Num3) {
            System.out.println("3rd number is positive = " + rand1Num3);

        } else {
            System.out.println("3rd number is negative = " + rand1Num3);
        }

        if (rand1Num5) {
            System.out.println("5th number is negative = " + rand1Num5);
        } else {
            System.out.println("5th number is positive = " + rand1Num5);

        }

        boolean all8Num = random_50And50Included1 == 0 || random_50And50Included2 == 0 ||
                random_50And50Included3 == 0 || random_50And50Included3 == 0 || random_50And50Included4 == 0 ||
                random_50And50Included5 == 0 || random_50And50Included6 == 0 || random_50And50Included7 == 0 ||
                random_50And50Included8 == 0;

        if (all8Num) {
            System.out.println("There is at least one zero among those numbers is = " + all8Num);

        } else {
            System.out.println("There is at least one zero among those numbers is = " + all8Num);

        }



        /* Task-3
        Write a program that asks user to enter 7 numbers between 0 and 50 (0 and 50 are also included)
-Store numbers in proper variables and print them first
-Find greatest and print the result with a proper message
-Find smallest and print the result with a proper message
-Find average of all 7 numbers and print result with a proper message
-Print true if first number is greater than or equal to 10, false otherwise with a proper message
-Print true if last number is less than or equal to 40, false otherwise with a proper message
-Print true if both first and last numbers are greater than 25, false otherwise with a proper message
-Print true if any of the numbers is zero or 50, false otherwise with a proper message
-Print true if there is no number between 40 and 50 (40 and 50 are included), false otherwise with a proper message
NOTE: Assume random numbers came as 4, 13, 23, 7, 0, 28, 49 respectively.
NOTE: Your result will be different based on the random numbers you will get.

EXPECTED RESULT:
Number 1 = 4
Number 2 = 13
Number 3 = 23
Number 4 = 7
Number 5 = 0
Number 6 = 28
Number 7 = 49
Greatest number is = 49
Smallest number is = 0
Average of 7 numbers is = 17
First number is greater than or equal to 10 = false
Last number is less than or equal to 40 = true
Both first and last numbers are greater than 25 = false
At least one of those numbers is 0 or 50  = true
There is no number between 40 and 50 = false
         */

        int rand0And50Included1 = (int) (Math.random() * 51);
        System.out.println("Number 1 = " + rand0And50Included1);
        int rand0And50Included2 = (int) (Math.random() * 51);
        System.out.println("Number 2 = " + rand0And50Included2);
        int rand0And50Included3 = (int) (Math.random() * 51);
        System.out.println("Number 3 = " + rand0And50Included3);
        int rand0And50Included4 = (int) (Math.random() * 51);
        System.out.println("Number 4 = " + rand0And50Included4);
        int rand0And50Included5 = (int) (Math.random() * 51);
        System.out.println("Number 5 = " + rand0And50Included5);
        int rand0And50Included6 = (int) (Math.random() * 51);
        System.out.println("Number 6 = " + rand0And50Included6);
        int rand0And50Included7 = (int) (Math.random() * 51);
        System.out.println("Number 7 = " + rand0And50Included7);

        int greatest = Math.max(Math.max(Math.max(rand0And50Included1, rand0And50Included2), Math.max(rand0And50Included3, rand0And50Included4)),
                Math.max(Math.max(rand0And50Included5, rand0And50Included6), rand0And50Included7));

        int smallest = Math.min(Math.min(Math.min(rand0And50Included1, rand0And50Included2), Math.min(rand0And50Included3, rand0And50Included4)),
                Math.min(Math.min(rand0And50Included5, rand0And50Included6), rand0And50Included7));

        System.out.println("Greatest number is = " + greatest);
        System.out.println("Smallest number is = " + smallest);
        System.out.println("Average of 7 numbers is = " + (rand0And50Included1 + rand0And50Included2 +
                rand0And50Included3 + rand0And50Included4 + rand0And50Included5 + rand0And50Included6 + rand0And50Included7) / 7);

        boolean num1 = rand0And50Included1 >= 10;
        if(num1){
            System.out.println("First number is greater then or equal to 10 = " + num1);

        }else{
            System.out.println("First number is greater then or equal to 10 = " + num1);
        }


        boolean num2 = rand0And50Included7 <= 40; // 49<=40  =false   13<=40  true
        if(num2){  //false  //true
            System.out.println("Last number is less than or equal to 40 = " + num2); //true
        }else{
            System.out.println("Last number is less than or equal to 40 = " + num2);  //false
        }


        boolean firstAndLastNum = rand0And50Included1 > 25 || rand0And50Included7 > 25;
        if(firstAndLastNum){
            System.out.println("Both first and lat numbers are greater than 25 = " + firstAndLastNum);
        }else{
            System.out.println("Both first and lat numbers are greater than 25 = " + firstAndLastNum);
        }

        boolean all7Num = rand0And50Included1 == 0 || rand0And50Included1 == 50 ||
                rand0And50Included2 == 0 || rand0And50Included2 == 50 ||
                rand0And50Included3 == 0 || rand0And50Included3 == 50 ||
                rand0And50Included4 == 0 || rand0And50Included4 == 50 ||
                rand0And50Included5 == 0 ||  rand0And50Included5 == 50 ||
                rand0And50Included6 == 0 || rand0And50Included6 == 50 ||
                rand0And50Included7 == 0 ||  rand0And50Included7 == 50;
        if(all7Num){
            System.out.println("At least of those numbers is 0 or 50 = " + all7Num);
        }else{
            System.out.println("At least of those numbers is 0 or 50 = " + all7Num);
        }

        boolean allNum = rand0And50Included1 >= 40 && rand0And50Included1 <= 50 &&
                rand0And50Included2 >= 40 && rand0And50Included2 >= 50 &&
                rand0And50Included3 >= 40 && rand0And50Included3 >= 50 &&
                rand0And50Included4 >= 40 && rand0And50Included4 >= 50 &&
                rand0And50Included5 >= 40 &&  rand0And50Included5 >= 50 &&
                rand0And50Included6 >= 40 && rand0And50Included6 >= 50 &&
                rand0And50Included7 >= 40 &&  rand0And50Included7 >= 50;
        if(allNum){
            System.out.println("There is a number between 40 and 50 = " + allNum);
        }else{
            System.out.println("There is no number between 40 and 50 = " + allNum);
        }


        /* Task-4
        Write a Java program that generates 3 random numbers between 0 and 100 (0 and 100 are included) and find if all numbers are more than 25

        Print true if all numbers are greater than 25
        Print false if any of the number is less than or equal to 25

         */

        int num0and100Included1 = (int) (Math.random() * 100);
        System.out.println("Number 1 = " + num0and100Included1);

        int num0and100Included2 = (int) (Math.random() * 100);
        System.out.println("Number 2 = " + num0and100Included2);

        int num0and100Included3 = (int) (Math.random() * 100);
        System.out.println("Number 3 = " + num0and100Included3);

        boolean rand0an100 = num0and100Included1 >= 25 && num0and100Included2 >= 25 &&
                num0and100Included3 >= 25;

        if(rand0an100){
            System.out.println("All numbers are greater than 25 = " + rand0an100);
        }else{
            System.out.println("All numbers are less than or equal to 25 = " + rand0an100);
        }


        /* Task-5

        Write a Java program to ask user to enter a number between 1 to 7 (1 and 7 are included)
       Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY

       Test data 1:
       Input number: 3

      Expected Output:The number entered returns WEDNESDAY

      Test data 2:
      Input number: 5

      Expected Output:The number entered returns FRIDAY

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7 (1 and 7 are included):");
        int userNum = userInput.nextInt();

        switch (userNum){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend!");
                break;
            default:
                System.out.println("This is not representing any day!");
        }


        /* Task-6
        Write a program that asks user to enter a number between
     -10 to 10 (-10 and 10 are included)
     -If number is positive, then print a message: “Number entered is POSITIVE”
     -If number is negative, then print a message: “Number entered is NEGATIVE”
     -If number is zero, then print a message: “Number entered is ZERO”
     -If number is even, then also print: “Number entered is EVEN”
     -If number is odd, then also print: “Number entered is ODD”

     Test data1:                                          Test data2:

     Expected Output1:                                    Expected Output2:
     Number entered is ZERO                           Number entered is POSITIVE
     Number entered is EVEN                           Number entered is ODD

         */

        System.out.println("Please enter a number between -10 to 10 (-10 and 10 are included):");
        int num_10and10 = userInput.nextInt();


            if (num_10and10 > 0) {
                System.out.println("Number entered is POSITIVE");
            } else if (num_10and10 < 0) {
                System.out.println("Number entered is NEGATIVE");
            } else {
                System.out.println("Number entered is ZERO!");
            }


            if (num_10and10 % 2 == 0) {
                System.out.println("Number entered is EVEN");
            } else { // Positive and Odd
                System.out.println("Number entered is ODD");
            }

            /* Task-7
            Jennifer is taking a math course . This math course requires students to take 3 exams. At the end, if the average of those exams is more than or equal to 70, then Jennifer will pass the course. However, if the average of those 3 exams is less than 70, then Jennifer will fail.

        Requirement:
        Write a Java program that asks Jennifer to enter her exam results and print if she passed or failed for the exam.

        NOTE: This program requires you to use Scanner

        Example Program 1:                                     Example Program 2:

        Program: Tell me your exam results?                   Program: Tell me your exam results?

        User: 20 50 85                                        User: 65 80 90

        Program: YOU FAILED!                                  Program: YOU Passed!

             */

        System.out.println("Please Jennifer enter your test results:");
        int grade1 = userInput.nextInt();
        int grade2 = userInput.nextInt();
        int grade3 = userInput.nextInt();
        int avg = (grade1 + grade2 + grade3) / 3;

        if(avg >= 70) {
            System.out.println("YOU PASSED!");
        }else {
            System.out.println("YOU FAILED!");
        }


        /* Task-8
        Write a Java program that asks user to enter 3 numbers

     -If all 3 numbers are equal, then print “TRIPLE MATCH”
     -If any of those 2 numbers are equal, then print “DOUBLE MATCH”
     -If all numbers are different, then print “NO MATCH”

     NOTE: This program requires you to use Scanner

     Example Program 1:                                  Example Program 1:                  Example Program 1:
    Program: Enter 3 numbers                           Program: Enter 3 numbers             Program: Enter 3 numbers

    User: 3 3 3                                        User: 5 4 5                         User: 2 5 7

    Program: TRIPLE MATCH                              Program: DOUBLE MATCH               Program: NO MATCH

         */

        System.out.println("Please enter 3 numbers:");
        int userNum1 = userInput.nextInt(), userNum2 = userInput.nextInt(), userNum3 = userInput.nextInt();

        if(userNum1 == userNum2 && userNum1 == userNum3){
            System.out.println("TRIPLE MATCH");
        }else if((userNum1 == userNum2 || userNum1 == userNum3) || (userNum2 == userNum1 || userNum2 == userNum3)){
            System.out.println("DOUBLE MATCH");

        }else{
            System.out.println("NO MATCH");
        }


    }
}
















