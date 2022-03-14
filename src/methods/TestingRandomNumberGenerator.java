package methods;

import utilities.Calculator;
import utilities.RandomNumberGenerator;

public class TestingRandomNumberGenerator {
    public static void main(String[] args) {
        /* Write a program that generate 2 random numbers between 37 and 63 and find division

         63 - 37 + 1 = 27
         */

       // Before we were doing this
        // int ran1 = (int)(Math.random() * 27) + 37;

        int ran1 = RandomNumberGenerator.getRandomNumber(37, 63);
        int ran2 = RandomNumberGenerator.getRandomNumber(37, 63);

        System.out.println(ran1);
        System.out.println(ran2);

        System.out.println(Calculator.divide(ran1, ran2));

    }
}
