package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = userInput.nextInt();
        userInput.nextLine();
        return number;

    }

    public static String getANameFromUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = userInput.next();
        return name;
    }

    public static String getAStringFromUser(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = userInput.nextLine();
        return str;

    }
}
