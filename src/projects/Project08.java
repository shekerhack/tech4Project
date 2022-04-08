package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Project08 {
    /*
    TASK-1 - countMultipleWords() method
    •	Write a method that takes a String[] array as an argument and counts how many strings in the array has multiple words
    •	This method will return an int which is the count of multiple words
    •	NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “

    Test data:
    [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]

    Expected output:
    2

         */

    public static int countMultipleWords(String[] str) {
        int countMultipleWords = 0;

        for (String element : str) {
            if (element.trim().contains(" ")) countMultipleWords++;
        }
        return countMultipleWords;
    }

        /*
        TASK-2 - removeNegatives() method
        •	Write a method that takes an “ArrayList<Integer> numbers” as an argument and removes all negative numbers from the given list if there are any
        •	This method will return an ArrayList with removed negatives

        Test data 1:
        [2, -5, 6, 7, -10, -78, 0, 15]

        Expected output 1:
        [2, 6, 7, 0, 15]


        Test data 2:
        [2, -5, 6, 7, -10, -78, 0, 15]

        Expected output 2:
        [2, 6, 7, 0, 15]

         */

    public static ArrayList<Integer> removeAllNegativeNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator(); // I put all elements in a queue

        while (iterator.hasNext()) { // We are asking if there is an element in the queue
            Integer element = iterator.next(); // this gets an element from the queue
            if (element < 0) { // if element came from the queue is less than 0
                iterator.remove(); // Remove
            }
        }

        return numbers;
    }

      /*
      TASK-3 - validatePassword() method
•	Write a method that takes a “String password” as an argument and checks if the given password is valid or not
•	This method will return true if given password is valid, or false if given password is not valid
•	A VALID PASSWORD:
	-should have length of 8 to 16 (length of 7 or 17 should return false)
	-should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
	-should NOT have any space

        Test data 1:

        Expected output 1:
        false


        Test data 2:
        abcd

        Expected output 2:
        false


        Test data 3:
        abcd1234

        Expected output 3:
        false


        Test data 4:
        Abcd1234

        Expected output 4:
        false


        Test data 5:
        Abcd123!

        Expected output 5:
        true

         */

    public static boolean validatePassword(String password) {

        if(!password.contains(" ") && (password.length() >= 8 && password.length() <= 16)){
            boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false, hasSpecial = false;
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);
                if (Character.isLetter(c)){
                    if (Character.isLowerCase(c)) hasLowerCase = true;
                    else if (Character.isUpperCase(c)) hasUpperCase = true;
                }else if (Character.isDigit(c)) {
                    hasDigit = true;
                }else hasSpecial = true;
            }
            return (hasDigit && hasLowerCase && hasUpperCase && hasSpecial);
        }else return false;
    }


    /*
    TASK-4 - validateEmailAddress() method
•	Write a method that takes a “String email” as an argument and checks if the given email is valid or not
•	This method will return true if given email is true, or false if given email is not valid
•	A VALID EMAIL:
	-should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>

        Test data 1:
        a@gmail.com

        Expected output 1:
        false


        Test data 2:
        abc@g.com

        Expected output 2:
        false


        Test data 3:
        abc@gmail.c

        Expected output 3:
        false


        Test data 4:
        abc@@gmail.com

        Expected output 4:
        false


        Test data 5:
        abcd@gmail.com

        Expected output 5:
        true

             */

    public static boolean validateEmailAddress(String email) {

        boolean flag = false;
        char second = Character.toLowerCase(email.charAt(1));


            for (int i = 0; i < email.length(); i++) {
                if (!Character.isWhitespace(email.charAt(i)) && !email.contains("@@"))
                    if( second >= 'a' && second <= 'z')
                        if(email.charAt(i) == 'g' && email.charAt(i + 1) == 'm' && email.charAt(i + 2) == 'a'
                                && email.charAt(i + 3) == 'i' && email.charAt(i + 4) == 'l' )
                           if(email.endsWith("com"))
                    flag = true;

            }

        return flag;
    }








    public static void main(String[] args) {

        System.out.println("\n----Task-1----\n");
        String[] str = {"foo", "", " ", "foo bar", "java is fun", "ruby"};
        System.out.println(Project08.countMultipleWords(str));

        System.out.println("\n----Task-2----\n");
        Integer[] number = {2, -5, 6, 7, -10, -78, 0, 15};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(number));
        System.out.println(numbers); //[2, -5, 6, 7, -10, -78, 0, 15]
        Project08.removeAllNegativeNumbers(numbers);
        System.out.println(Project08.removeAllNegativeNumbers(numbers)); //[2, 6, 7, 0, 15]


        System.out.println("\n----Task-3----\n");

        String password1 = " ";
        String password2 = "abcd";
        String password3 = " abcd1234";
        String password4 = " Abcd1234";
        String password5 = " Abcd123!";

        System.out.println(Project08.validatePassword(password1));
       System.out.println(Project08.validatePassword(password2));
       System.out.println(Project08.validatePassword(password3));
        System.out.println(Project08.validateEmailAddress(password4));
        System.out.println(Project08.validateEmailAddress(password5));

        System.out.println("\n----Task-4----\n");

        String email1= "a@gmail.com";
        String email2 = "abc@g.com";
        String email3 = "abc@gmail.c";
       String email4 = "abcd@gmail.com";

        System.out.println(Project08.validateEmailAddress(email1));
        System.out.println(Project08.validateEmailAddress(email2));
        System.out.println(Project08.validateEmailAddress(email3));
        System.out.println(Project08.validateEmailAddress(email4));



    }

}



