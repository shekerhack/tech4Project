package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

        /*
        Write a program that reads a name from user
        Reverse the name and print it back

        Test data:
        Kaly

        Expected output:
        ylaK

        Test data:
        Abraham

        Expected output:
       The reversed name = maharbA
       The reverse name to Uppercase = MAHARBA
         */


        String name = ScannerHelper.getANameFromUser();

        name.charAt(name.length() - 1); //start point
        name.charAt(name.length() - 2);
        name.charAt(0); //end point


        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

            //  The reversed name = maharbA
            //       The reverse name to Uppercase = MAHARBA

            for (int i1 = name.length() - 1; i1 <= 0; i1++) {
                System.out.println(name.charAt(i1));
            }
        }

            // Other way
            String reversedName = ""; // empty container. it means you put reversed letters. it is like Int sum = 0;

            for (int i2 = name.length() - 1; i2 >= 0; i2--) {
                reversedName += name.charAt(i2);
            }
            System.out.println("The reversed name = " + reversedName);
            System.out.println("The reverse name to UpperCase = " + reversedName.toUpperCase());


    }
}
