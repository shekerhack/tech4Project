package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {
        /*
        int[] numbers = {5, 3, 0, -5};

        Find the greatest and print it

        RESULT:
        {5, 3, 0, -5} -> 5
        {4, 10, 15} -> 15
         */

        System.out.println("\n----TASK-1-solution with sort----\n");

        int[] numbers = {5, 3, 0, -5};
       // Arrays.sort(numbers); //----greatest
        //System.out.println(numbers[numbers.length-1]); // 5

        System.out.println("\n---TASK-1-solution without sort--\n");

        int max = numbers[0];
        for (int number :numbers){
            //if(number > max) max = number;
            max = Math.max(max, number);
        }
        System.out.println(max);

        /*
        TASK-2
        Create a double array and store below elements
        {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

        Find the minimum value

        RESULT:
        0.5
         */

        System.out.println("\n---TASK-2-solution without sort--\n");

        double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double minValue = Double.MAX_VALUE; //2.5  //other way = number [0]

        for (double number : array) {
            //if(number < minValue) minValue = number;
            minValue = Math.min(minValue, number);

        }
        System.out.println(minValue);

        /*
        Use above double array and find second minimum value

        Result:
        1.5
         */

       // double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        System.out.println("\n---TASK-3-solution without sort--\n");

        // double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double minValue2= Double.MAX_VALUE;  //2.5  //other way = number [0]

        // To find a min it should be Max
        // To find max it should be MIN


        for (double number : array) {
            if(number == minValue) continue;
            else if(number < minValue2) minValue2 = number;
        }
        System.out.println(minValue2);


        }
}
