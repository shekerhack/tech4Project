package homeworks;

import collections.arrayLists.SortingArrayList;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework21 {
    /*
    Task-1
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print numbers starting from 1 to given argument. BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.
    Test Data 1: 3                               Test Data 3: 18
    Expected Result 1:                           Expected Result 3:
                                                 Fizz
    1                                            1
    2                                            2
    Fizz                                         Fizz
                                                 4
    Test Data 2: 5                               Buzz
    Expected Result 2:                           Fizz
    Fizz
    1                                            7
    2                                            8
    Fizz                                         Fizz
    4                                            Buzz
    Buzz                                         11
     */

    public static void fizzBuzz(int numbers) {
        for (int i = 0; i <= numbers; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /*
    Task-2
    Requirement:
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return a String. BUT it will return “Fizz” if the given number is divided by 3, “Buzz” if the number is divided by 5, and “FizzBuzz” if the number is divided both by 3 and 5. Otherwise, it will return number itself.

    Test Data 1: 0
    Expected Result 1: FizzBuzz

    Test Data 2: 1
    Expected Result 2: 1

    Test Data 3: 3
    Expected Result 3: Fizz

    Test Data 4: 5
    Expected Result 4: Buzz

    Test Data 5: 15
    Expected Result 5: FizzBuzz
     */

    public static String fizzBuzz2(int number) {
            if (number % 15 == 0) return "FizzBuzz";
            else if (number % 3 == 0) return "Fizz";
            else if (number % 5 == 0) return "Buzz";
            else return number + "";  // other way convert String.valueOf(number)
    }

    /*
    TASK-3
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 11

    Test Data 3: “ab110c045d”
    Expected Result 3: 155

    Test Data 4: “525”
    Expected Result 4: 525
     */

    public static int findSumNumbers(String str){
        String s = "0";
        int sum = 0;

        for(int i = 0;i < str.length(); i++) {
            char chars = str.charAt(i);
            if (Character.isDigit(chars)) {
                s += chars;
                //if the chars is not digit
            } else {
                sum += Integer.parseInt(s);

                s = "0";
            }
        }
           return sum + Integer.parseInt(s);
    }

    /*
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will return an int which is the number presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 6

    Test Data 3: “ab110c045d”
    Expected Result 3: 110

    Test Data 4: “525”
    Expected Result 4: 525
     */

    public static int findBiggestNumber(String str){
        int number1 = 0, number2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                number1 = number1 * 10 + (str.charAt(i) - '0');
            else {
                number2 = Math.max(number2, number1);
                number1 = 0;
            }
        }
        return Math.max(number2, number1);
    }

    /*
    TASK-5
    -Create a method called countSequenceOfCharacters()
    -This method will take a String argument and it will return a String which is the count of repeated characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “abc”
    Expected Result 2: “1a1b1c”

    Test Data 3: “abbcca”
    Expected Result 3: “1a2b2ca”

    Test Data 4: “aaAAa”
    Expected Result 4: “2a2A1a”
     */

    public static String countSequenceOfCharacters(String s) {
        String str = "";
        int count = 1;
        if (s.length() == 0) return "";
        else {
            for (int i = 0; i < s.length() - 1; i++) {
                count = 1;
                if (("" + s.charAt(i)).equals("" + s.charAt(i + 1))) {
                    count++;
                    i = i + count - 1;
                }
                str += String.valueOf(count) + s.charAt(i);
            }
            if (!("" + s.charAt(s.length() - 1)).equals(("" + s.charAt(s.length() - 2))))
                str += "1" + s.charAt(s.length() - 1);
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println("\nTASK-1");
        fizzBuzz(3);
        System.out.println("\n"); fizzBuzz(5);
        System.out.println("\n"); fizzBuzz(18);

        System.out.println("\nTASK-2\n" + fizzBuzz2(0) + "\n" + fizzBuzz2(1) +
                "\n" + fizzBuzz2(3) + "\n" + fizzBuzz2(5) + "\n" + fizzBuzz2(15));

        System.out.println("\nTASK-3\n" + findSumNumbers("abc$") + "\n" + findSumNumbers("a1b4c 6#") +
                "\n" + findSumNumbers("ab110c045d") + "\n" + findSumNumbers("525"));

        System.out.println("\nTASK-4\n" + findBiggestNumber("abc$") + "\n" + findBiggestNumber("a1b4c 6#") +
                "\n" + findBiggestNumber("ab110c045d") + "\n" + findBiggestNumber("525"));

        System.out.println("\nTASK-5\n" + countSequenceOfCharacters("") + "\n" + countSequenceOfCharacters("abc") +
                "\n" + countSequenceOfCharacters("abbcca") + "\n" + countSequenceOfCharacters("aaAa"));

    }
}

