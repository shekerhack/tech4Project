package loops.controlStatements;
import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        Print all the numbers between given 2 integers from biggest to smallest
        (given numbers are included)

         */


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int num1 = userInput.nextInt();

        System.out.println("Please enter second number:");
        int num2 = userInput.nextInt();

        int biggest = Math.max(num1, num2);
        int smallest = Math.min(num1, num2);

        for(int i = biggest; i >= smallest; i--) {
            System.out.println(i);
        }

        // Other way with break

        for(int i1 = biggest; i1 >= smallest; i1--) {
            System.out.println(i1);
            if (i1 == 10) break; // it will be on the page when you have 10 in the margin 3-17
        }
        /*
        if(max >= 10){
            for (int i = max; i >= min; i--) {
                System.out.println(i);
                if(i == 10) break;
            }
        }

         */

        // 17 16 15 ---- 10




    }
}
