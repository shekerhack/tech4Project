package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
    if number is dividable by 5 then finish the program but if number is not dividable by 5,
    keep asking user to enter a new number until user enters a number that is dividable by 5

    Example program:
    Program: Please enter a number
    User: 3
    Program: This number is not dividable by 5

    Program: Please enter a new number
    User: 10
    Program: This number is dividable by 5
 */

        Scanner userInput = new Scanner(System.in);
        int number;
        int attempt = 1;

        do {
            if(attempt == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            number = userInput.nextInt();
            if(number % 5 != 0) System.out.println("This number is not dividable by 5");
            attempt++;
        }while (number % 5 != 0);

        System.out.println("This number is dividable by 5");

        }

    }

