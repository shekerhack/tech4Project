package operators.shortHandAssignmentOperators;

import java.util.Scanner;
import java.util.SortedMap;

public class Exercise2 {
    public static void main(String[] args) {

        /*  Write a Java program that asks user to enter their balance and one day transactions.
        Subtract each transaction from balance and return new balance using shorthand operator
        */
        //Requirements:
        //Use Scanner class to read input from user
        //
        //Test data:
        //Balance = $100.00
        //1st transaction = $25.75
        //2nd transaction =  $12.50
        //3rd transaction = $7.25
        //
        //Expected output:
        //Balance after 1st transaction = $74.25
        //Balance after 2nd transaction = $61.75
        //Balance after 3rd transaction = $54.5

        Scanner transactionInput = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = transactionInput.nextDouble();

        System.out.println("Enter your 1st transaction:");
        double firstTran = transactionInput.nextDouble();
        balance = firstTran; //balance has changed
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Enter your 2nd transaction:");
        double secondTran = transactionInput.nextDouble();
        balance = secondTran; //balance has changed
        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Enter your 3rd transaction:");
        double thirdTran = transactionInput.nextDouble();
        balance = thirdTran;
        System.out.println("Balance after 3rd transaction = $" + balance);




        }


}

