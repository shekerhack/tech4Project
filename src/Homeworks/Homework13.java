package Homeworks;

import java.util.Arrays;


public class Homework13 {
    public static void main(String[] args) {

        /*
        Task-1
        Write a program that prints all the numbers from 1 to 10 (1 and 10 are included)

        If the number is dividable by 2, then print “Foo” instead of number itself
        If the number is dividable by 5, then print “Bar” instead of number itself
        If the number is dividable by both 2 and 5, then print “FooBar” instead of number itself
        Else print number itself

        Expected output:
        1
        Foo
        3
        Foo
        Bar
        Foo
        7
        Foo
        9
        FooBar
         */
        System.out.println("\n----Task-1---\n");
        for (int i = 1; i < 11; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        /*
        Task-2
        Write a program to find the first positive and negative numbers in an int array
        Test data:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        Expected output:
        First positive number is: 5
        First negative number is: -4


        NOTE: Make your code dynamic that works for any given int array.

         */

        System.out.println("\n----Task-2---\n");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean firstPositive = false;
        boolean firstNegative = false;


        for (int element : numbers) {
            if (element > 0 && !firstPositive) {
                firstPositive = true;
                System.out.println("First positive number is : " + element);
            } else if (element < 0 && !firstNegative) {
                firstNegative = true;
                System.out.println("First negative number is : " + element);
            }
            if (firstPositive && firstNegative) break;

        }

        /*
        Task-3
        Write a program to generate 5 random numbers between 1 to 10 (1 and 10 are included) and store those numbers in an int array.

        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return false

         */

        System.out.println("\n----Task-3---\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        int random4 = (int) (Math.random() * 10 + 1);
        int random5 = (int) (Math.random() * 10 + 1);

        int[] number1 = new int[5];
        number1[0] = random1;
        number1[1] = random2;
        number1[2] = random3;
        number1[3] = random4;
        number1[4] = random5;


        for (int element : number1) {

            if (element == 2 || element == 3)
                System.out.println(true);
            else
                System.out.println(false);

        }
        System.out.println(Arrays.toString(number1));

        /*
        Task-4
        Write a program to find if String array contains “apple” as an element, ignore cases.

        Test data 1:
        String[] list = {“banana”, “orange”, “Apple”};

        Expected output:
        true

        Test data 2:
        String[] list = {“pineapple”, “banana”, “orange”, “grapes”};

        Expected output:
        false

        NOTE: Make your code dynamic that works for any given
                 */

        System.out.println("\n----Task-4---\n");

        String[] list = {"pineapple", "banana", "orange", "grapes"};
        boolean found = false;


        for (String word : list) {
            if (word.equalsIgnoreCase("apple")) {
                found = true;
                break;
            }
        }
        System.out.println(found);

        /*
        Task-5
        Write a program to find the all-matching elements between 2  int arrays

        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};

        Expected output 2:
        There is no matching elements

        NOTE: Make your code dynamic that works for any given int arrays.

         */

        System.out.println("\n----Task-5---\n");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean isDuplicateFound = false;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]){
                    System.out.println(numbers1[i]);
                    isDuplicateFound = true;
                    break;
                }
            }
        }

        if(!isDuplicateFound) System.out.println("There is no matching elements");

        /*
        Task-6
        Write a program to print duplicated characters in a String, ignore cases

        Test data 1:
        String str = ”baNana”;

        Expected output 1:
        a
        N

        Test data 2:
        String str = ”aPple”;

        Expected output 1:
        P

        NOTE: Make your code dynamic that works for any given String.

         */

        System.out.println("\n----Task-6---\n");

        String str = "baNana";
        String duplicates = "";

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !duplicates.contains(str.toLowerCase().substring(i, i + 1))) {
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }

            }


        }
    }
}
