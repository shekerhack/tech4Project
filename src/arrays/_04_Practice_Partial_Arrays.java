package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("\n----TASK-1----\n");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for(int num : numbers){
            System.out.println(num);
        }

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println("\n----TASK-2----\n");
        System.out.println("\n-----For Each Loop----\n");
        int sum1 = 0;

        for(int number : numbers){
            sum1 += number;
        }
        System.out.println(sum1);

        System.out.println("\n-----Fori Loop----\n");
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0
       */
        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        System.out.println("\n----TASK-3----\n");
        int sum2 = 0;

        for(int i = 0; i <= 2; i++){
            sum2 += numbers[i];
        }
        System.out.println(sum2);

        /*TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
        */

        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println("\n----TASK-4----\n");

        int sum3 = 0;
        for(int i = numbers.length - 1; i >= numbers.length - 5; i--){   // for(int i = 2; i <= 6; i++)
            sum3 += numbers[i];
        }
        System.out.println(sum3);

        /*
        TASK-5
        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        156
         */

        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println("\n----TASK-5----\n");
        int productOfLast4 = 1;

        for(int i = numbers.length - 1; /*6*/ i >= numbers.length - 4; i--){  //for(int i = 3; i < numbers.length; i++){
            //int number = numbers[i];
            if(numbers[i] != 0)
              productOfLast4 *= numbers[i];
        }
        System.out.println(productOfLast4);


        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero

        RESULT:
        true
         */

        //int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println("\n----TASK-6----\n");

        boolean hasZero = false;

        for(int elements : numbers){
            if(elements == 0){
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero);




    }
}
