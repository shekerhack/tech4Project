package homeworks;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

    /*
    Task-1
    Requirement:
    Assume that you are given a String as below;
    String str = ”SDLC is step by step procedure to create an application”;
    Write a program to find length of given String and the indexes of “SDLC” and “application” words
     */


        ////////////////////TASK-1 SOLUTION///////////////////
        System.out.println("\n------------TASK-1------------\n");

        String str = "SDLC is step by step procedure to create an application";

        System.out.println("The length of the string is = " + str.length()); // 55
        System.out.println("The index of 'SDLC' is = " + str.indexOf("SDLC")); // 0
        System.out.println("The index of 'application' is = " + str.indexOf("application")); // 44


        /*
        Task-4
        Requirement:
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;
        •
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
         */
        System.out.println("\n-----TASK-2-----\n");

        String str1 = "  I know how to code with Python  ";
        System.out.println(str1.trim().toUpperCase().replace("PYTHON","JAVA"));
        System.out.println(str1.replace("Python", "Java").toUpperCase().trim());
        System.out.println(str1.toUpperCase().trim().replace("PYTHON", "JAVA"));

        /* Task-3
        Requirement:
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */

        System.out.println("\n-----TASK-3----\n");

        String str2 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println(str2.trim().charAt(0));
        System.out.println(str2.trim().charAt(str2.length()-1));

        /*
        Task-4
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */

        System.out.println("\n-----TASK-4----\n");

        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ".trim();
        String s4 = s1.trim().replace("ECH", "ech") +
                s2.trim().replace("g", "G") + (s3.trim().toLowerCase());

        System.out.println(s4);

        /*
        Task-5
        Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
         */
        System.out.println("\n-----TASK-5----\n");

        String favColor = ScannerHelper.getANameFromUser();

        System.out.println("1st character is = " + favColor.charAt(0) + "\n2nd character is = " + favColor.charAt(favColor.length() - 1));
        System.out.println("First 3 characters are = " + favColor.substring(0, 3) + "\nLast 3 characters are = " + favColor.substring(favColor.length() - 3));

        /*
        Task-6
        Requirement:
    Write a program that asks user to enter a full sentence
    Then, convert all sentence to lower case and print the first and last words in the given sentence
    Test data:
    JavA is an object-oriented programming LanguAGE
    We today

    Expected output:
    1st word is = java -we
    2nd word is = language-today
         */

        System.out.println("\n-----TASK-6----\n");

        String address = ScannerHelper.getAStringFromUser();
        System.out.println("1st word is = " + address.toLowerCase().substring(0,address.indexOf(' ')));
        System.out.println("2nd word is = " + address.toLowerCase().substring(address.lastIndexOf(' ') + 1));

        /*
        Task-7
        Requirement:
        Write a program that asks user to enter a full sentence
        Then, check if given sentence contains $ character
        If it contains $ character, then find the index of the $ character and print a proper message for the found index

        Test data 1:
        I saved $100 to buy new airpods
        Expected output 1:
        This sentence contains $ character
        $ character’s index is = 8

        Test data 2:
        I’ll become a Software Engineer in Test
        Expected output 2:
        This sentence does not contain $ character

         */

        System.out.println("\n-----TASK-7----\n");

        String sentence = ScannerHelper.getAStringFromUser();

        if(sentence.contains("$")){
            System.out.println(" This sentence contains $ character" + "\ncharacter’s index is = " + sentence.indexOf('$'));
        }
        else{
            System.out.println("This sentence does not contain $ character");
        }













    }
}
