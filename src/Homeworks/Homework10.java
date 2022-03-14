package Homeworks;

public class Homework10 {
    public static void main(String[] args) {
        /*
        Task-1
        Assume that you are given a String of any length. First check if it has at least length of 1. If the length is zero, then print “Length is zero”
     If it has length more than zero, then find:
    -The length of the String
    -First char in the String
    -Last char in the String
    -Check if the String contains any vowel letters
        -if it has any vowel, then print “This String has vowel”
        -Else, print “This String does not have vowel”
        Vowels = a, e, i, u, o

        Test Data 1:                                          Test Data 2:
    String s1 = “JavaScript”;                              String s2 = "";

    Expected Result 1:                                     Expected Result 2:
    Length is = 10                                        Length is zero
    First char is = J
    Last char is = t
    This String has vowel
         */
        String s = "";

        if (s.isEmpty()){ // s.length() == 0 | s.length() < 1
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + s.length());
            System.out.println("First char is = " + s.charAt(0));
            System.out.println("Last char is = " + s.charAt(s.length() - 1));

            if (s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("i")
                    || s.toLowerCase().contains("o") || s.toLowerCase().contains("u")){
                System.out.println("This String has vowel");
            }else{
                System.out.println("This String does not have vowel");
            }
        }

        /*
        Task-2
        Assume that you are given a String of any length. First check if it has at least length of 3. If the length is less than 3, then print “Length is less than 3”
        If it has length more than or equal to 3, then find the middle character for the odd length, middle 2 characters for the even length.

        Test Data 1:                                  Test Data3:
        String s1 = “”;                                 String s3 = "civic";

        Expected Result 1:                             Expected Result 3:
        Length is less than 3                           v

        Test Data 2:                                   Test Data 4:
        String s2 = “ab”;                            String s4 = "toyota";

        Expected Result 2:                          Expected Result 4:
        Length is less than 3                        yo
         */

            String s2 = "ab";

            if (s2.length() <= 3) {
                System.out.println("Length is less than three");

            } else if (s2.length() >= 3 && s2.length() % 2 == 0) {
                System.out.println(s2.substring(s2.length() / 2 - 1, s2.length() / 2 + 1));

            } else if (s2.length() >= 3 && s2.length() % 2 == 1) {
                System.out.println(s2.charAt(s2.length() / 2));
            }

        /*
        Task-3
        Write a program that divides the given String. Length of given will be at least 4.
     if length of the String is not at least 4, then print “INVALID INPUT”
    If the length is 4 or more, then
    -print the first two characters
    -print the last two characters
    -print all the middle characters other than first and last 2 characters

    Test Data 1:
    String s1 = “abc”;

    Expected Result 1:
    INVALID INPUT


         */

            String s3 = "abc";

            if (s3.length() >= 4) {
                System.out.println("First 2 characters are = " + s3.substring(0, 2) +
                        "\nLast 2 characters are = " + s3.substring(s3.length() - 2) +
                        "\nThe other characters are = " + s3.substring(2, s3.length() - 2)); //will print last letters on
            } else {
                System.out.println("INVALID INPUT");

            }

        /* Task-4
        Assume that you are given a String of any length. First check if it has at least length of 2. If the length is less than 2, then print “Length is less than 2”
        If it has length more than or equal to 2, then if first 2 and last 2 characters of the given String are same.
        If first 2 and last characters are same, then print true. Otherwise, print false

        Test Data 1:
        String s1 = “”;

        Expected Result 1:
        Length is less than 2

         */
        String s4 = "xyzaxy";

        if(s4.length() >= 2){
            if(s4.substring(0, 2).equalsIgnoreCase(s4.substring(s4.length() - 2))){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }else {
            System.out.println("Length less than 2");
        }

        /* Task-5
        Write a program that gets rid of first and last characters of given two String values. After getting rid of first and last characters,
        add these two String values to each other and print the result. If one of the String values has length that is less than 2, then print “INVALID INPUT”

         */

        String s5 = "123456";
        String s6 = "Blue";

        if(s5.length() >= 2 && s6.length() >= 2){
        for(int i = 0; i < s5.length(); i++) {
            System.out.print(s5.substring(1, s5.length() - 1));

        for(int b = 0; b <= s6.length(); b++) {
            System.out.print(s6.substring(1, s6.length() - 1));
        }
            }
        }
        else{
            System.out.println("INVALID INPUT");
        }


        /*
        Task -6
        Write a program that checks if a given String that has length of 4 at least and starts and ends with xx.
        -If the length of String is less than 4, then print “INVALID INPUT”
        -If given String starts and ends with xx, then print true.
        -Otherwise, print false
         */

        String s7 = "green";

        if(s7.length() >= 4) {
            if (s7.substring(0, 2).equalsIgnoreCase("xx") && s7.substring(s7.length() - 2).equalsIgnoreCase("xx")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else {
            System.out.println("INVALID INPUT");
        }

        }
    }


