package loops.whileLoop;

import utilities.ScannerHelper;

import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {

        int myNumber = 7;

        int userNumber = ScannerHelper.getNumberFromUser();

        while(userNumber != myNumber){
            userNumber = ScannerHelper.getNumberFromUser();
        }
        System.out.println("Finally you could find the number!");

        // other way

        int myNumber1 = 7;

        System.out.println("The random number is = " + myNumber);
        Random random = new Random();
        int usersNumber1 = random.nextInt(10) + 1;

        int attempt = 1;

        while(usersNumber1 != myNumber){
            System.out.println("My random attempt number is = " + usersNumber1);
            usersNumber1 = random.nextInt(10) + 1;
            attempt++;
        }


        System.out.println("Finally you could find the number!");
        System.out.println("You could find it after " + attempt + " times!!!");
    }
}
