package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {
        /*
        name        --> next()
        age         --> nextInt()
        myBrainOk   --> nextBoolean()
        fav quote   --> nextLine()
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = userInput.next();

        System.out.println("What is your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOk = userInput.nextBoolean();

        System.out.println("What is your address?");
        String address = userInput.next();

        System.out.println("User name is = " + name + "\nUser age is = " + age + "\nMy brain is fried = " + myBrainOk + "\nMy address is =" + address);

        int number = 10; //declaration and assignment
        System.out.println("Number is = " +number); //10

        number = 20; //re-assignment
        System.out.println("Number is = "+ number); //20




    }
}
