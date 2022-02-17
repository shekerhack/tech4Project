package projects;

import java.util.Scanner;
import java.util.SortedMap;

public class Project02 {
    public static void main(String[] args) {

        /* Task-1
        Write a program that asks user to enter their 3 numbers.
        Then multiply these numbers and print the result in the format;
         */

        Scanner numberEntry = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int num1 = numberEntry.nextInt();
        int num2 = numberEntry.nextInt();
        int num3 = numberEntry.nextInt();
        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3));

        /* Task-2
        write a program that asks user to enter their first name, last name and year of birth.
        Then calculate the age by subtracting the year of birth from current year we are in;
         */

       Scanner userInfo = new Scanner(System.in);
       System.out.println("What is your first name?");
       String userName = userInfo.next();

        System.out.println("What is your last name?");
        String userLastName = userInfo.next();

        System.out.println("What is your year of birth?");
        int userBirthYear = userInfo.nextInt();
        userBirthYear = 2022 - userBirthYear ;

        System.out.println(userName + " " + userLastName + "\'s age is = " + userBirthYear);

        /* Task-3
        Write a program that asks user to enter their full name and weight as kg.
        Then calculate the weight as lb. Note: Assume 1kg = 2.205lbs.
         */

       Scanner userEntry = new Scanner(System.in);
        System.out.println("What is your full name?");
        String userFullName = userEntry.nextLine();

        System.out.println("What is your weight?");
        double userWeight = userEntry.nextDouble();
        userWeight = 2.205 * userWeight;

        System.out.println(userFullName + "\'s weight is =  " + userWeight + "lbs.");

        /* Task-4
        Write a program that asks 3 students to enter their full name and age
        Then print each student's age with their full name as {fullName}'s age is {age}
        And calculate the average age for these students and print result as: The average age is {averageAge}
        And find the oldest age and print result as: The oldest age is {oldestAge}
        And find the youngest and print result as: The youngest age is {youngestAge}
         */

        Scanner student = new Scanner(System.in);
        System.out.println("What is your full name?");
        String student1FullName = student.nextLine();
        System.out.println("What is your age?");
        int student1Age = student.nextInt();

        System.out.println("What is your full name?");
        String student2FullName = student.nextLine();

        System.out.println("What is your age?");
        int student2Age = student.nextInt();

        System.out.println("What is your full name?");
        String student3FullName = student.nextLine();

        System.out.println("What is your age?");
        int student3Age = student.nextInt();


        System.out.println(student1FullName + "\'s age is " + student1Age +
                "\n" + student2FullName + "\'s age is " + student2Age +
                "\n" + student3FullName + "\'s age is " + student3Age);

        System.out.println("The average student age is " + (student1Age + student2Age + student3Age) / 3);


        int oldestAge = Math.max(student1Age, student2Age);
        System.out.println("The oldest age is " + Math.max(Math.max(student1Age, student2Age), student3Age));


        int youngestAge = Math.min(student1Age,student2Age);
        System.out.println("the youngest age is " + Math.min(Math.min(student1Age, student2Age), student3Age));








    }
}
