package projects;

public class Project03 {
    public static void main(String[] args) {
        /* Task-1
        Assume that you are given below Strings
       String s1 = “24”, s2 = “5”;

     -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
       The sum of 24 and 5 = 29
       The subtraction of 24 and 5 = 19
       The division of 24 and 5 = 4.8
       The multiplication of 24 and 5  = 120
       The remainder of 24 and 5 = 4

         */
        // 1. I will convert String to int and double (primitives).
        // 2. I will use arithmetic operators to find sum, subtraction, division, multiplication, and remainder of given String object.

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("The sum of 24 and 5 = " + sum);

        int sub = Integer.parseInt(s1) - Integer.parseInt(s2);
        System.out.println("The subtraction of 24 and 5 = " + sub);

        double div1 = Double.parseDouble(s1) / Double.parseDouble(s2);
        System.out.println("The division of 24 and 5 = " + div1);

        int times = Integer.parseInt(s1) * Integer.parseInt(s2);
        System.out.println("The multiplication of 24 and 5 = " + times);

        int remainder = Integer.parseInt(s1) % Integer.parseInt(s2);
        System.out.println("The remainder of 24 and 5 = " + remainder);

        /* Task-2
        Write a program that generates a random number between 1 to 35 (1 and 35 are included)
      -Find if the given number is a Prime Number
      -If random number generated is a prime one, then print “THE NUMBER IS A PRIME NUMBER”.
      -Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”

     Prime number is a number that can be divided only by itself and 1. It cannot be divided by any other number. The smallest prime number is 2 and 2 is the only even prime number.
     So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
      Test data 1:                                                       Test data 2:
     Random number = 11                                                Random number = 15
    Expected result 1:                                                 Expected result 2:
    THE NUMBER IS A PRIME NUMBER                                       THE NUMBER IS NOT A PRIME NUMBER

         */
        // 1. I will use mathClass
        // 2. I will use if-else statement

        int random1And35Included = (int) (Math.random() * 35) + 1;
        System.out.println("Random number = " + random1And35Included);

        switch (random1And35Included){
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
            case 29:
            case 31:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            default:
                System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        /* Task-3
        Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are included)
    -Find and print each number in an ascending order
    -Ascending order is ordering from lowest to greatest

    NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this task.

    Test data: Assume below numbers are generated
    Random number 1 = 43
    Random number 2 = 7
    Random number 3 = 30

    Expected result:
    Lowest number is = 7
    Middle number is = 30
    Greatest number is = 43

         */
        // int random1nd50Included1 = (int) (Math.random() * 50) +1;
        // int random1nd50Included2 = (int) (Math.random() * 50) +1;
        //int random1nd50Included3 = (int) (Math.random() * 50) +1;

        // 1. I will use MathClass to generate random numbers
        // 2. I will use MathClass to find greatest and lowest amount of random numbers.
        //3. I will add all 3 random numbers and it will be divided by 3.

        int min = Math.min(Math.min((int) (Math.random() * 50) + 1, (int) (Math.random() * 50) + 1), (int) (Math.random() * 50) + 1);
        System.out.println("Lowest number is = " + min);

        System.out.println("Middle number is = " + ((int) (Math.random() * 50) + 1 + (int) (Math.random() * 50) + 1 + (int) (Math.random() * 50) + 1) / 3);

        int max = Math.max(Math.max((int) (Math.random() * 50) + 1, (int) (Math.random() * 50) + 1), (int) (Math.random() * 50) + 1);
        System.out.println("Greatest number is = " + max);

        /* Task-4
        Assume you are given a single character. (It will be hard-coded)
    -First, check if given char is a letter but not digit or special character.
    -If the given char is not a letter, then print “Invalid character detected!!!”.
    -If it is a letter, then find out if it is an uppercase or a lowercase letter.
    -If the letter is uppercase, then print “The letter is uppercase”, else print “The letter is lowercase”.
    NOTE: You need to use ASCII table and casting for this task
    Test data 1: Assume you are given 5
    char c = ‘5’;
    Expected result 1:
    Invalid character detected!!!
    Test data 2: Assume you are given a
    char c = ‘a’;
    Expected result 2:
    The letter is lowercase
    Test data 3: Assume you are given R
    char c = ‘R’;
    Expected result 3:
    The letter is uppercase

         */

        char c = 'A';


        if (c >= 'A' && c <= 'Z') {
            System.out.println("The letter is upper case");
        } else if (c >= 'a' && c <= 'z') {

            System.out.println("The letter is lowercase");
        } else {
            System.out.println("Invalid character detected!!!");
        }

        /* Task-5
        Assume you are given a single character. (It will be hard-coded)
    -First, check if given char is a letter but not digit or special character.
    -If it is not a letter, then print “Invalid character detected!!!”.
    -If it is a letter, then find out whether it is a vowel or a consonant.
    -If the letter is vowel, then print “The letter is vowel”, else print “The letter is consonant”.
    -Vowel letters: a, e, I, o, u, A, E, I, O, U
    NOTE: You need to use ASCII table and casting for this example
    Test data 1: Assume you are given #
    char c = ‘#’;
    Expected result 1:
    Invalid character detected!!!
    Test data 2: Assume you are given E
    char c = ‘E’;
    Expected result 2:
    The letter is vowel
    Test data 3: Assume you are given R
    char c = ‘R’;
    Expected result 3:
    The letter is consonant

         */

        char character = 'I';

        if(character == 'a' || character == 'e' || character == 'i' || character == 'o'
                || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'){
            System.out.println("The letter is vowel");
        }else if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("The letter is consonant");
        }else{
            System.out.println("Invalid character detected!!!");
    }

    /* Task-6
    Assume you are given a single character. (It will be hard-coded)
   -First, check if the given char is a special character but not a digit or not a letter.
   -If it is not a special character, then print “Invalid character detected!!!”.
   -If it is a special character, then print “Special character is = {givenCharacter}”.
   NOTE: You need to use ASCII table and casting for this example
   Test data 1: Assume you are given 8
   char c = ‘8’;
   Expected result 1:
   Invalid character detected!!!
   Test data 2: Assume you are given *
   char c = ‘*’;
   Expected result 2:
   Special character is = *
   TASK-7 (Find if given char is a letter or digit or special character)
  -Assume you are given a single character. (It will be hard-coded)
  -If given char is a letter, then print “Character is a letter”
  -If given char is a digit, then print “Character is a digit”
  -Otherwise, print “Character is a special character

     */

        char character1 = '}';

        if((character1 >= 'a' && character1 <= 'z') || (character1 >= 'A' && character1 <= 'Z')) {

            System.out.println("Invalid character detected!!!");

        } else if(character1 >= '0' && character1 <= '9') {

            System.out.println("Invalid character detected!!!");

        } else {

            System.out.println("Character is a special character = " + character1);
        }

        /* Task-7
        Assume you are given a single character. (It will be hard-coded)
    -If given char is a letter, then print “Character is a letter”
    -If given char is a digit, then print “Character is a digit”
    -Otherwise, print “Character is a special character”
    Test data 1: Assume you are given g
    char c = ‘g’;
    Expected result 1:
    Character is a letter
    Test data 2: Assume you are given 5
    char c = ‘5’;
    Expected result 2:
    Character is a digit
    Test data 3: Assume you are given 5
    char c = ‘@’;
    Expected result 3:
    Character is a special character

         */

        // 1. I will use if-else statement to find letters, digits, and special characters.

        char c3 = '6';

        if((c3 >= 'a' && c3 <= 'z') || (c3 >= 'A' && c3 <= 'Z')) {

            System.out.println("Character is a letter ");

        } else if(c3 >= '0' && c3 <= '9') {

            System.out.println("Character is a digit");

        } else {

            System.out.println("Character is a special character = " + c3);
        }

    }
}










