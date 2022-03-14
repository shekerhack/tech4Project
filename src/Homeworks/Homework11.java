package Homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        /*
        Write a program that prints all the numbers that are dividable by 7 starting from 1 to 100 (1 and 100 are included)

        NOTE: Result must be in one line with space and dash separators

        Expected Output: 7 – 14 – 21 - 28 . . . 77 - 84 - 91 - 98

         */

        String s = "";

        for (int i = 1; i <= 101; i++) {
            if (i % 7 == 0) s += i + " - ";
        }
        if (!s.isEmpty()) System.out.println(s.substring(0, s.length() - 3));
        else System.out.println(s); // without dash at the end.

        /*
        Write a program that prints all the numbers that are dividable by both 2 and 3 starting from 1 to 50 (1 and 50 are included)
        NOTE: Result must be in one line with space and dash separators

        Expected Output:6 – 12 – 18 . . . 36 – 42 - 48

         */

       String s1 = "";

        for (int i = 1; i <= 51; i++) {
            if (i % 2 == 0 && i % 3 == 0) s1 += i + " - ";
        }
        if (!s1.isEmpty()) System.out.println(s1.substring(0, s1.length() - 3));
        else System.out.println(s1);

        /*
        Task-3
        Write a program that prints all the numbers that are dividable by 5 starting from 100 to 50 (100 and 50 are included)
        NOTE: Result must be in one line with space and dash separators

        Expected Output: 100 – 95 – 90 . . . - 60 - 55 - 50

         */

        String s3 = "";

        for (int i = 100; i >= 51; i--) {
            if (i % 5 == 0) s3 += i + " - ";
        }
        if (!s3.isEmpty()) System.out.println(s3.substring(0, s3.length() - 3));
        else System.out.println(s3);

        /*
        Task-4
        Write a program that prints the squares of all numbers starting from 0 to 7 (0 and 7 are included)
    NOTE: Use loop!!!

    Expected Output:
    The square of 0 is =  0
    The square of 1 is =  1
    The square of 2 is =  4
    The square of 3 is =  9
    The square of 4 is =  16
    The square of 5 is =  25
    The square of 6 is =  36
    The square of 7 is =  49

         */


        for (int i = 0; i <= 8; i++) {
                System.out.println("The square of " +  i + " is = " + i * i);
        }

        /*
        Task-5
        Write a program that finds sum of the numbers starting from 1 to 10
    Calculation => 1+2+3+4+5+6+7+8+9+10

    NOTE: Use loop!!!

    Expected Output:
    55

         */

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
            System.out.println(sum);
        }

        /*
        Task-6
        Write a program that asks user to enter a positive number
    And find the factorial of the number
    0! = 1
    1! = 1
    2! = 1*2 = 2
    3! = 1*2*3 = 6

     Test Data 1:                                    Test Data 2:
      5                                                 7
     Expected Output 1:                              Expected Output 2:
        120                                            5040
     NOTE:                                           NOTE:
     5! = 1*2*3*4*5 = 120                         5! = 1*2*3*4*5*6*7 = 5040

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int num = userInput.nextInt();
        int factorial = 1;


        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println();
            System.out.println(factorial);
        }

        /*
        Task-7
        Write a program that asks user to enter their first and last name
        And count how many vowel letters they have in their first and last name
        Vowel letters = a, e, i, o, u

        Example program1:
        Program: Please enter your full name
        User : Chris Thompson
        Program: There are 3 vowel letters in this full name

        Example program2:
        Program: Please enter your full name
        User : Alexander George
        Program: There are 7 vowel letters in this full name

         */

       Scanner firstLastName = new Scanner(System.in);
        System.out.println("Please enter first and last name:");
        String firstAndLastName = firstLastName.nextLine();
        firstAndLastName = firstAndLastName.toLowerCase();

        int count = 0;

        for (int i = 0; i < firstAndLastName.length(); i++) {
            if (firstAndLastName.charAt(i) == 'a' || firstAndLastName.charAt(i) == 'e'   // if(CharacterHelper.isVowel(firstAndLastName.charAt(i))){
                    || firstAndLastName.charAt(i) == 'i'
                    || firstAndLastName.charAt(i) == 'o'
                    || firstAndLastName.charAt(i) == 'u')

                count++;
        }
            System.out.println("There are " + count + " vowel letters in his full name");

        /*
        Task-8
        Write a program that asks user to enter a number
        If number is less than 100, then ask user to enter another number and find sum of entered 2 numbers.
        Keep asking user to enter numbers until the sum of all entered numbers is at least 100.

        If first number entered by user more than or equal to 100, print message “This number is already more than 100” and do not ask user to enter any other numbers
        NOTE: Use do while loop!!!
        Example program1:
        Program: Please enter a number
        User : 120
        Program: This number is already more than 100

        Example program2:
        Program: Please enter a number
        User : 50

        Program: Please enter a number
        User : 75
        Program: Sum of the entered numbers is at least 100

         */

       int number = 0;
        int summary = 0;
        int attempt = 0;

        do {
            System.out.println("Please enter a number");
            number = userInput.nextInt();

            if (attempt == 1 && number >= 100) {
                System.out.println("This number is already more than 100");
                break;
            }else {
                summary += summary;
                if (summary >= 100) {
                    System.out.println("Sum of the numbers is at least 100");
                }
            }

            attempt++; // for updating how many times we ran the loop
        } while (summary < 100); // if you put = sign it will keep running code


        /*
        Task-9
        Assume that you are given a number and you are asked to find series of Fibonacci numbers
        What is Fibonacci numbers: a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers
        It always starts with 0 and 1
        EX: 0, 1, 1, 2, 3, 5, 8, 13, 21

        NOTE: Write a program that handles any n series of numbers

        Test data 1:
        5

        Expected output 1:
        0 – 1 – 1 – 2 – 3

         */

        //At recap

        int n1 = 0, n2 = 1, total = 0;
        String massage = "";
        for(int i = 0; i < 7; i ++){
            massage += n1 + " - ";
            total = n1 +n2;

            n1 = n2;
            n2 = total;
        }
        System.out.println(massage. substring(0, massage.length() - 3));  // without dash


        /*
        Task-10
        Write a program that asks user to enter a name
        If name starts with j or J, then finish the program
        But, if the name does not start with j or J, then keep asking until user gives a name that starts with j or J.

        Example program1:
        Program: Please enter a name
        User : Jessie
        Program: End of the program

        Example program2:
        Program: Please enter a name
        User : Alexander
        Program: Please enter a name
        User : Chris
        Program: Please enter a name
        User : Jordan
        Program: End of the program

         */

        String name = userInput.nextLine();


        while(!name.startsWith("j") && !name.startsWith("J")){
            System.out.println("Please enter a name:");
             name = userInput.nextLine();
        }
        System.out.println("End of the program");

    }
}


