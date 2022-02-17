package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
Find the min and max of given 3 numbers, write
down the Pseudo code and print min and max with
proper messages.


NOTE: Declare and Assign all of them in one single line
x = 4, y = 67, z = -54
 */
        int x = 4, y = 67, z = -54;

        Math.max(x, y);  //67

        System.out.println("Max of every number is = " + Math.max(Math.max(x, y), z));

        System.out.println("Min of every number is = " + Math.min(Math.min(x, y), z));

        /* or we can do this way
        System.out.println("Max of every number is = " + Math.max(Math.max(4, 64), -54));

        System.out.println("Min of every number is = " + Math.min(Math.min(4, 67), -54));

         */

        /* Write a program which is going to print max of given 3 numbers: 4, 56, 23

         */

        int num6 = 4;
        int num7 = 56;
        int num8 = 23;
        Math.max(num6, num7);
        System.out.println("Max of given 3 numbers are = " + Math.max(Math.max(num6, num7), num8));

        /* Write a program which is going to print max of given 3 numbers: 4, 56, 23
         */

        System.out.println("Max of given 3 numbers are = " + Math.max(23, Math.max(4, 56)));

        /* Write a program which is going to ask 4 number print the max of retrieved 4 numbers.
        It is Scanner
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 4 number: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();

        Math.max(num1, num2); // one single number / num9, num10
        Math.max(num3, num4); // one single number / num11, num12
        // Other way to do it below

        Math.max(Math.max(num1, num2), Math.max(num3, num4)); // you can delete this

        System.out.println("The biggest number you entered: " + Math.max(Math.max(num1, num2), Math.max(num3, num4)));

        Math.min(num1, num2);
        Math.min(num3, num4);
        Math.min(Math.min(num1, num2), Math.min(num3, num4));

        System.out.println("The smallest number you entered: " + Math.min(Math.min(num1, num2), Math.min(num3, num4)));






    }
}