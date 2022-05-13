package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args){
        /* Task-1
        Write a program that generates a random number between 0 and 50 (both 0 and 50 are included)
        Print true if number is in between 10 and 25 (10 and 25 included)
        Print false otherwise
         */
        int random0and50Included = (int)(Math.random()*50)+1;
        System.out.println(random0and50Included);

        if(random0and50Included >= 10 && random0and50Included <= 25){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        /* Task-2
        Write a program that generates a random number between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half is number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1st half is 1-50
        2nd half is 51-100

        Test data:
        34

        Expected result:
        34 is in the 1st half
        34 is in the 2nd quarter

         */
        int random1and100Included = (int)(Math.random() * 100) + 1;
        boolean _1stQuarter = random1and100Included >=1 && random1and100Included <=25;
        boolean _2ndQuarter = random1and100Included >=26 && random1and100Included <=50;
        boolean _3rdQuarter = random1and100Included >=51 && random1and100Included <=75;
        boolean _4thQuarter = random1and100Included >=76 && random1and100Included <=100;
        boolean _1stHalf = random1and100Included >=1 && random1and100Included <=50;
        boolean _2ndHalf = random1and100Included >=51 && random1and100Included <=100;

        if(_1stQuarter && _1stHalf){   // if(rand >= 1 && rando <= 25){
            System.out.println(random1and100Included + " is in the 1st half" + "\n" + random1and100Included +  // if(rand <= 50){
                    " is in the 1st quarter");                                                                 // }else{
        }else if(_2ndQuarter && _1stHalf){
            System.out.println(random1and100Included + " is in the 1st half" + "\n" + random1and100Included +
                    " is in the 2nd quarter");
        }else if(_3rdQuarter && _2ndHalf){
            System.out.println(random1and100Included + " is in the 2nd half" + "\n" + random1and100Included +
                    " is in the 3rd quarter");
        }else{
            System.out.println(random1and100Included + " is in the 2nd half" + "\n" + random1and100Included +
                    " is in the 4th quarter");
        }

        /* Task-3
        Write a program that asks user to enter 5 numbers between 1 to 10 (1 and 10 are included)
    They will get some points based on numbers they entered. So, their points will be calculated as below
    1st  number will be multiplied by 5 and added as points
    2nd number will be multiplied by 4 and added as points
    3rd number will be multiplied by 3 and added as points
    4th number will be multiplied by 2 and added as points
    5th number will be multiplied by 1 and added as points
    If user enters any number that is not in the range, then user will not get any points from that number

    Test data:
    3 7 2 1 8

    Expected result:
    59
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 1 to 10 are included:");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt(), num3 = userInput.nextInt(), num4 = userInput.nextInt(), num5 = userInput.nextInt();

        if((num1 >= 1 && num1 <=10) && (num2 >= 1 && num2 <=10) && (num3 >= 1 && num3 <=10) &&
                (num4 >= 1 && num4 <=10) && (num5 >= 1 && num5 <=10)){
            System.out.println((num1 * 5) + (num2 * 4) + (num3 * 3) + (num4 * 2) + (num5 * 1));

        }else{
            System.out.println("You did not get any points");
        }


    }
}
