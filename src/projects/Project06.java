package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence as a String, and count how many words that sentence has, and print it with given below message.

        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just print “This sentence does not have multiple words”.

        Test data 1:
        Java is fun

        Expected output 1:
        This sentence has 3 words.
        */
        //Task 1

        Scanner userSentence = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String str = userSentence.nextLine();
        String [] sentence = str.split(" ");

        if(sentence.length >= 2){
            System.out.println("This sentence has " + sentence.length + " words.");
        }else{
            System.out.println("This sentence does not have multiple words");
        }


        /*Task 2
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        EX/ kayak, civic, madam
        NOTE: Write a program that handles any String
        NOTE: First check if the given String has at least 1 character, if the String does not have at least one character, then print message “This word does not have 1 or more characters”
        Test data 1:
        civic
        Expected output 1:
        This word is palindrome */


        System.out.println("Please enter a word:");
        String word = userSentence.nextLine();
        String reversedString = "";

        //civic
        //01234
        if (!word.isEmpty()){
            // 4, 3, 2, 1, 0
            // 1st way
            for (int i = word.length() - 1; i >= 0; i--) reversedString += word.charAt(i);
            // 2nd way
            //for (int i = 0; i < word.length(); i++) rWord += word.charAt(word.length() - 1 - i);

            if (word.equals(reversedString)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");

        }else{
            System.out.println("This word does not have 1 or more characters");
        }

        /* Other way doing it

        int wordLength = word.length();


            for (int i = wordLength - 1; i >= 0; --i) {
                reverseString = reverseString + word.charAt(i);
            }
                if(wordLength < 1) {
                   System.out.println("This word does not have 1 or more characters");
               }else if (word.length() >= 1 && word.toLowerCase().equals(reverseString.toLowerCase())) {
                System.out.println("This word is palindrome");
            } else {
                System.out.println("This word is not palindrome");
            }
            */


            /* Task-3
            Write a program that asks user to enter a sentence as a String and count how many a or A letters that sentence has and print it with given below message.

            NOTE: Write a program that handles any String
            NOTE: First check if the given sentence has 1 character at least. If not, then just print “This sentence does not have any characters”.

            Test data 1:

            Expected output 1:
            This sentence does not have any characters.
             */

        System.out.println("Please enter a sentence:");
        String str1 = userSentence.nextLine();
        int letterCounter = 0;

             if(str1.length()< 1) System.out.println("This sentence does not have any characters");
        for(int i = 0; i < str1.length(); i++){
            String letterA = str1.toLowerCase().charAt(i) + "";
            if(letterA.equals("a") && str1.length()>1) {
                letterCounter++;
            }
        }

        System.out.println("This sentence has " + letterCounter + " a or A letters.");



        /*
        Task-4
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided by 2, “Bar” for the numbers divided by 3 and
        “FooBar” for the numbers divided by both 2 and 3.

        Test data:
        6

        Expected output:
        1
        Foo
        Bar
        Foo
        5
        FooBar
         */

        System.out.println("Please enter a positive number:");
        int num = userSentence.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0 && i % 3 ==0) System.out.println("FooBar");
            else if(i % 2 == 0) System.out.println("Foo");
            else if(i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
            }


        }

    }
