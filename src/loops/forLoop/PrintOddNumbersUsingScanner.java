package loops.forLoop;

//import utilities.ScannerHelper;

import java.util.Scanner;

public class PrintOddNumbersUsingScanner {

    public static void main(String[] args) {

        /*
        Write a Java program to ask user to enter a number and print
        all the odd numbers starting from 0 to given number by user
        (0 and given number is included)
        Test data:
        15
        Expected output:
        1
        3
        5
        .
        .
        .
        13
        15
         */

        //int givenNumberByUser = ScannerHelper.getNumberFromUser();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please put a number");
        int givenNumberByUser = userInput.nextInt();

        for(int i = 0; i <= givenNumberByUser; i++){
            if(i % 2 ==1) System.out.println(i);

        }
    }
}
