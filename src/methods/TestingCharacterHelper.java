package methods;

import utilities.CharacterHelperProject04;

public class TestingCharacterHelper {
    public static void main(String[] args) {
        /* Task-1

         */
        char b = ' ';
        System.out.println("Task - 1 - " + CharacterHelperProject04.isSpace(b));


        /* Task-2

         */
        char b1 = '9';
        System.out.println("Task - 2 - " + CharacterHelperProject04.isDigit(b1));

        /* Task-3

         */

        char a1 = 'b';
        System.out.println("Task - 3 - " + CharacterHelperProject04.isUpperCase(a1));


        /* Task4

         */
        char c1 = 'T';
        System.out.println("Task - 4 - " + CharacterHelperProject04.isLowercase(c1));

        /* Task-5

         */

        char c2 = 'C';
        System.out.println("Task - 5 - " + CharacterHelperProject04.isLetter(c2));

        /* Task-6

         */
        char c3 = 'y';
        System.out.println("Task - 6 - " + CharacterHelperProject04.isVowel(c3));

        /* Task-7

         */

        char b3= 'A';
        System.out.println("Task - 7 - " + CharacterHelperProject04.isConsonant(b3));



    }
}
