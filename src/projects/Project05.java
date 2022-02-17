package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {
        /* Task-1
        Write a program that asks user to enter a String, and swaps first and last 4 characters of this String and print the modified String

        Test data:
        TechGlobal

        Expected output:
        obalGlTech

        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is less than 8, then print message “This String does not have 8 characters”

         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String str = userInput.nextLine();


        if (str.length() >= 8){
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 3) + str.substring(0, 4));
        } else{
            System.out.println("This String does not have 8 characters");
        }

        /* Task-2
        Write a program that asks user to enter a sentence, and swaps first and last words of this sentence and print the modified sentence

        Test data:
        Selenium is an automation tool

        Expected output:
        tool is an automation Selenium

        NOTE: Write a program that handles any sentence
        NOTE: First check if the sentence has at least 2 words, if the sentence has only one or no word, then print message “This sentence does not have 2 or more words to swap”

         */

     System.out.println("Please enter any sentence:");
        String str2 = userInput.nextLine();

        int firstIndex = str2.indexOf(" ");
        int lastIndex = str2.lastIndexOf(" ");


        String firstWord = str2.substring(0,firstIndex);
        String lastWord = str2.substring(lastIndex);
        String middleWords = str2.substring(firstIndex,lastIndex+1);

        if(firstIndex > 0){
            System.out.println(lastWord + middleWords + firstWord);
        }else{
            System.out.println("This sentence does not have 2 or more words to swap");
        }

        /* Task-3
        Assume that you are given some Strings as below, and you want to replace bad words with good words.

        String str1 = “These books are so stupid”;
        String str2 = “I like idiot behaviors”;
        String str3 = “I had some stupid t-shirts in the past and also some idiot look shoes”;

        Write a Java program that checks any given String and replace bad words like “stupid” and “idiot” with “nice” keyword

        Expected output:
        These books are so nice
        I like nice behaviors
        I had some nice t-shirts in the past and also some nice look shoes
         */

        String str3 = "These books are so stupid";
        String str4 = "I like idiot behaviors";
        String str5 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str3.replaceAll("stupid", "nice"));
        System.out.println(str4.replaceAll("idiot", "nice"));
        System.out.println(str5.replaceAll("stupid", "nice"));

        /* Task-4
        Write a program that asks user to enter their name.
        First check if length of name is more than 2 and is even or odd
        If length of name is less than 2, then print “Invalid input!!!”
        If length of name is odd, then print middle character from the name
        If length of name is even, then print middle 2 characters from the name

        Test data:
        J

        Expected output:
        Invalid input!!!

        Test data:
        Lionel

        Expected output:
        on

        Test data:
        James

        Expected output:
        m
         */
        System.out.println("Please enter a name:");
        String name = userInput.nextLine();

        if(name.length() % 2 == 1 && name.length() > 2) {
            System.out.println(name.charAt(name.length() / 2)); //output - m
        }
        else if(name.length() % 2 == 0 && name.length() > 2){
            System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1)); // output - on
        }else{
            System.out.println("Invalid input!!!");
        }

        /* Task-5
        Write a program that asks user to enter a country.
        First check if length of country is more than 5. If not, then print “Invalid input!!!”
        If length of country is more than 5, then print country name without first 2 and last 2 characters

        Test data:
        Peru

        Expected output:
        Invalid input!!!

        Test data:
        Brazil

        Expected output:
        az
         */

        System.out.println("Please enter a country:");
        String country = userInput.nextLine();

        if(country.length() >= 5){
            System.out.println(country.substring(2, country.length() - 2));
        }else{
            System.out.println("Invalid input!!!");
        }

        /*
        Task-6
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements

        Test data:
        2860 S River Rd Suite 350, Des Plaines IL 60018

        Expected output:
        2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018
         */

        System.out.println("Please enter a full address:");
        String address = userInput.nextLine();
        String  word1, word2, word3, word4, word5, word6, word7, word8, word9, word10;
        word1 = address.replace("a", "*");
        word2 = word1.replace("A", "*");
        word3 = word2.replace("e" ,"#");
        word4 = word3.replace("E" ,"#");
        word5 = word4.replace("i" ,"+");
        word6 = word5.replace("I" ,"+");
        word7 = word6.replace("u" ,"$");
        word8 = word7.replace("U" ,"$");
        word9 = word8.replace("o" ,"@");
        word10 = word9.replace("O" ,"@");

        System.out.println(word10);

        /* Task-7
        Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included), Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.

        Test data:
        int randomNumber1 = 12;
        int randomNumber2 = 4;
        Expected output:
        12 – 11 – 9 – 8 – 7 – 6 - 4
         */

        int randomNumber1 = (int) (Math.random() * 26);
        int randomNumber2 = (int) (Math.random() * 26);
        int mathMin = Math.min(randomNumber1, randomNumber2);
        int mathMax = Math.max(randomNumber1, randomNumber2);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        String s = ""; //container

        for(int i = mathMin; i <= mathMax; i++) {

            if (i % 5 != 0) s += i + " - "; // other way to prevent dash at the: if(i ==25) System.out.print(i); else System.out.print(i + "-");
        }

        }

}








