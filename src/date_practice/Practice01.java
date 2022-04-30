package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their date of year
        Then calculate their age and print with the message below

        EXPECTED OUTPUT:
        You are {age} years old!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of year :");
        int year  = scanner.nextInt();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(sdf.format(date));

        System.out.println("Your age " + (currentYear - year) + " years old!");
    }
}
