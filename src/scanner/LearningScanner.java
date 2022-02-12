package scanner;

import java.util. Scanner;

public class LearningScanner {
    public static void main(String[] args) {

        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading the data.
        Above is Pseudo code. Pseudo code when you explain your steps and your own code.
         */

        Scanner scanner = new Scanner(System.in);  // creating a scanner object
        System.out.print("Please put your first name"); // this is what I want user to put
        String firstName = scanner.next(); // storing the first name from user

        System.out.println("Please put your last name:"); //second massage
        String lastName = scanner.next(); //storing the last name

        System.out.println("The name user put = " + firstName); //Printing my object/variable
        System.out.println("Last name =" + lastName);  // Printing my object/variable



    }
}
