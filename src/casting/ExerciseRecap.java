package casting;

import java.util.Scanner;
import java.util.SortedMap;

public class ExerciseRecap {
    public static void main(String[] args) {

        /* Write a program Asks user for 5 of their grades as String and print out their avg.
        Input:
        "45"
        "50"
        "55"
        "60"
        "65"
        Output:
        55
         */

         /* Scanner userGrade = new Scanner(System.in);
        System.out.println("Please enter your 5 grades:");
        String grade1 = userGrade.next(), grade2 = userGrade.next(), grade3 = userGrade.next(), grade4 = userGrade.next(), grade5 = userGrade.next();
        double g1 = Double.parseDouble(grade1), g2 = Double.parseDouble(grade2), g3 = Double.parseDouble(grade3), g4 = Double.parseDouble(grade4), g5 = Double.parseDouble(grade5);

        System.out.println((int)(g1 + g2 + g3 + g4 + g5) / 5);

        // Other way to do this

        String grad1 = userGrade.next(), grad2 = userGrade.next(), grad3 = userGrade.next(), grad4 = userGrade.next(), grad5 = userGrade.next();

        double g01 = Double.parseDouble(userGrade.next()), g02 = Double.parseDouble(userGrade.next()), g03 = Double.parseDouble(userGrade.next()),
                g04 = Double.parseDouble(userGrade.next()), g05 = Double.parseDouble(userGrade.next());

        /* Other short way
        System.out.println((int)
                (Double.parseDouble(userGrade.next()) +
                Double.parseDouble(userGrade.next()) +
                        Double.parseDouble(userGrade.next()) +
                        Double.parseDouble(userGrade.next()) +
                        Double.parseDouble(userGrade.next())) / 5); */

        /*  Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.
        Input:
        "What is your balance?"
        user:
        456.7
        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4
        Output:
        "Your balance is now = 328.9"

         */
        Scanner userGrade = new Scanner(System.in);
        System.out.println("What is your balance?");
        String balance = userGrade.next();

        System.out.println("What is your next 3 transactions");
        String t1 = userGrade.next(), t2 = userGrade.next(), t3 = userGrade.next();

        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(t1);
        Double t2D = Double.valueOf(t2);
        Double t3D = Double.valueOf(t3);

        System.out.println("Your balance is now = " + (balanceD - t1D - t2D - t3D));

        /* Other way short form

        Scanner userGrade = new Scanner(System.in);
        System.out.println("What is your balance?");
        String balance = userGrade.next();

        System.out.println("What is your next 3 transactions");

        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(t1);
        Double t2D = Double.valueOf(t2);
        Double t3D = Double.valueOf(t3);

        System.out.println("Your balance is now = " + (Double.valueOf(balance) -
        Double.valueOf(userGrade.next()) -
        Double.valueOf(userGrade.next()) -
        Double.valueOf(userGrade.next())));
         */

        /*  Write a program Asks user for full name, age, phone number then
        enter their 3 kids age as String the print it out everything plus  the oldest kid,
        youngest and the age difference between oldest adn youngest.

        Program : "Please enter your name:"
        User: John Doe
        Program: "Please enter you age:"
        User; 45
        Program: "Please enter your phone number:"
        User: (123) 123 1234
        Program: "Enter the ages of your kids:"
        User:
        12
        22
        17
        Program
        Your name is John Doe, your phone number is (123) 123 1234,
        Your age is 45 years old, Your oldest kid is 22 years old,
        Your youngest is 12, difference between oldest and youngest is 10 years.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String fullName = input.nextLine(); // if there is would be on up nextInt. You should put nextLine after it because it won't work

        System.out.println("Please enter your age:");
        String age = input.next();
        input.nextLine(); // clearing the spaces!!!

        System.out.println("Please enter your phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your kids");
        String age1 = input.next(), age2 = input.next(), age3 = input.next();
        int age1Int = Integer.parseInt(age1), age2Int = Integer.parseInt(age2), age3Int = Integer.parseInt(age3);


        /*
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.
         */

        int oldestKid = Math.max(age3Int, Math.max(age1Int, age2Int));
        int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));

        int ageDifference = Math.abs(oldestKid - youngestKid);

        System.out.println("Your name is " + fullName + ", your phone number is " +
                phoneNumber + ". \nYour age " + age + " years old. Your oldest kid is " + oldestKid + " years old, \nyour youngest is " +
                youngestKid + ",difference between oldest and youngest is "  + ageDifference + "years.");

        /*  Other way to do it with negative

        Write a program ASK user for full name, age, phone number then
        enter their 3 kids age as string then print out everything plus
        the oldest kid, youngest and the age difference between oldest
        and youngest.
        Program: "Please enter your name"
        User: John Doe,     User: Akin Kaya,
        Program: "Please enter your age:"
        User: 45,           User: 29
        Program: "Please enter your phone number:"
        User: (123) 123 1234, User: (864) 123 4531
        Program: "Enter the ages of your kids"
        User:
        12,         15.7
        22,         -32
        17,         Abc
        Program:
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.
         */

        /* Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your age:");
        String age = input.next();
        input.nextLine(); // clearing the spaces!!!

        System.out.println("Please enter your phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your kids");

        int age1Int = Integer.parseInt(input.next()),
                age2Int = Integer.parseInt(input.next()),
                age3Int = Integer.parseInt(input.next());

        int oldestKid = Math.max(age3Int, Math.max(age1Int, age2Int));
        int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                ", \nYou are " + age + " years old, Your oldest kid is " + oldestKid + " years old, your" +
                "\nyoungest is " + youngestKid + ", difference between oldest and youngest is " +
                Math.abs(oldestKid - youngestKid) + "\nyears.");

         */







    }
}
