package loops.whileLoop;

import utilities.ScannerHelper;

public class PrintNumbersAscending {
    public static void main(String[] args) {

        /*
        Write a program that prints numbers from 1 to 7 (both included)
         */

        // for loop

        for (int i = 1; i <= 8; i++) {
            System.out.println(i);
        }

        // while loop

        int i1 = 1;

        while (i1 <= 7) {
            System.out.println(i1);
            i1++;
        }
    }
}
