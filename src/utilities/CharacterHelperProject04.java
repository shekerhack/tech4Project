package utilities;

public class CharacterHelperProject04 {
    /*
    Task-1
    Create a new class called as "CharacterHelper" under the utilities package
    -NOTE: create all methods in the CharacterHelper class
    -NOTE: give proper names for all of your variables
    -NOTE: feel free to use comments for your codes for explanations

     */
    public static boolean isSpace(char arg) {
        // String s = String.valueOf(arg);
        if (arg == 32) {
            return true;
        } else {
            return false;
        }
    }

    /* Task-2
    Create a method called isDigit()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a digit, return false if the given char is not a digit
    NOTE: Digits are represented from 48 to 57 in the ASCII Table

     */

    public static boolean isDigit(char arg) {
        if (arg >= 48 && arg <= 57) {
            return true;
        } else {
            return false;
        }
    }

    /* Task-3
    Create a method called isUppercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is an uppercase letter, return false if the given char is not an uppercase letter
    NOTE: Uppercase letters are represented from 65 to 90 in the ASCII Table

     */

    public static boolean isUpperCase(char arg) {
        if (arg >= 65 && arg <= 90) {
            return true;
        } else {
            return false;
        }
    }

    /* Task-4
    Create a method called isLowercase()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a lowercase letter, return false if the given char is not a lowercase letter
    NOTE: Lowercase letters are represented from 97 to 122 in the ASCII Table

     */

    public static boolean isLowercase(char arg) {
        if (arg >= 97 && arg <= 122) {
            return true;
        } else {
            return false;
        }

    }

        /* Task-5
    Create a method called isLetter()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a letter, return false if the given char is not a letter
    NOTE: Letters are represented from 65 to 90 and from 97 to 122 in the ASCII Table

         */

    public static boolean isLetter(char arg) {
        if ((arg >= 65 && arg <= 90) || (arg >= 97 && arg <= 122)) {
            return true;
        } else {
            return false;
        }
    }

    /* Task-6
  Create a method called isVowel()
-It should be public and static
-It should be a return type and must return a boolean
-It should take a char argument
-It should return true if the given char is a vowel letter, return false if the given char is not a vowel letter
NOTE: Vowel letters are A,E,O,U,I,a,e,o,u,i

     */
    public static boolean isVowel(char arg) {
        switch (arg) {
            case 'A':
            case 'E':
            case 'O':
            case 'U':
            case 'I':
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                return true;
            default:
                return false;

        }
    }

    /* Task-7
    Create a method called isConsonant()
    -It should be public and static
    -It should be a return type and must return a boolean
    -It should take a char argument
    -It should return true if the given char is a consonant letter, return false if the given char is not a consonant letter
    NOTE: Consonant letters are any number represented from 65 to 90 and from 97 to 122 in the ASCII Table but not vowels (A,E,O,U,I,a,e,o,u,i) or specials etc.

     */

    public static boolean isConsonant(char arg) {
        switch (arg) {
            case 'A':
            case 'E':
            case 'O':
            case 'U':
            case 'I':
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                return false;
            default:
                return true;
        }
    }
}
