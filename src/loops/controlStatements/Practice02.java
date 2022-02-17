package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
    between 0 to 10 ( 0 and 10 are included)
    Print all the numbers between given 2 integers starting
    from smallest to biggest (given numbers are included)
    HOWEVER, do not print the number of 5

    6 8   -> 6 7 8

    9 7   -> 7 8 9

    1 3   -> 1 2 3
    3 7   -> 3 4 6 7
         */
        /* Pseudo code
        1. Create scanner to ask for 2 numbers
        2. Create variable for num1 and num2 with user numbers
        3. compare the numbers to find smallest to biggest and store them in variables min and max
        4. start: min
           end: max
           increment
           do not print 5
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int num1 = input.nextInt();

        System.out.println("Please enter second number:");
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        // First way - without continue
        for (int i = min; i < max; i++){
            if(i != 5) System.out.println(i);
        }

        // Second way- using continue-means skip
        for(int i = min; i < max; i++){
            if(i != 5) continue;
            System.out.println(i);
        }

    }
}
