package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    /*
    TASK-1 - findGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find the greatest and smallest elements from the array and print them. Complete task using sort() method.

    Test data:
    [10, 7, 7, 10 -3, 10, -3]

    Expected output:
    Smallest = -3
    Greatest = 10
     */
    public static void findGreatestAndSmallestWithSort(int[] number) {
        Arrays.sort(number);
        System.out.println("\n----Task-1----\n");
        System.out.println("Smallest = " + number[0]);
        System.out.println("Greatest = " + number[number.length - 1]);
    }

        /*
        TASK-2 findGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find the greatest and smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.

        Test data:
        [10, 7, 7, 10 -3, 10, -3]

        Expected output:
        Smallest = -3
        Greatest = 10
         */

    public static void findGreatestAndSmallest(int[] number) {
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println("\n----Task-2----\n");
        //print smallest element
        System.out.println("Smallest = " + number[0]);
        //print greatest element
        System.out.println("Greatest = " + number[number.length - 1]);
    }

           /*
           TASK-3 - findSecondGreatestAndSmallestWithSort() method
            Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. Complete task using sort() method.

            Test data:
            [10, 5, 6, 7, 8, 5, 15, 15]

            Expected output:
            Second Smallest = 6
            Second Greatest = 10

            */

    public static void findSecondGreatestAndSmallestWithSort(int[] number) {
        Arrays.sort(number);

        System.out.println("\n----Task-3----\n");
        for (int i = 0; i < number.length; i++) {
            if (number[i + 1] != number[i]) {
                System.out.println("Second Smallest = " + number[i + 1]);
                break;
            }
        }

        for (int i = number.length - 1; i > 0; i--) {
            if (number[i - 1] != number[i]) {
                System.out.println("Second Greatest = " + number[i - 1]);
                break;

            }
        }
    }

    // Other way

    public static void findSecondGreatestAndSmallestWithSort2(int[] nums){
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]){
                System.out.println("Second Smallest = " + nums[i]);
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] != nums[nums.length - 1]){
                System.out.println("Second Greatest = " + nums[i]);
                break;
            }
        }



    }

         /*
         TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.

        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]

        Expected output:
        Second Smallest = 6
        Second Greatest = 10
          */

    public static void findSecondGreatestAndSmallest(int[] number) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int numbers : number) {
            if (numbers < min) min = numbers;
        }

        for (int numbers : number) {
            if (numbers < secondMin && numbers != min) secondMin = numbers;
        }

        int max = number[0];
        int secondMax = number[0];


        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                secondMax = max;
                max = number[i];
            }

        }

        System.out.println("\n----Task-4----\n");
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    // Other way

    public static void findSecondGreatestAndSmallest2(int[] nums){
        int max = 0;
        int min = 0;
        int secondMax = 0;
        int secondMin = 0;
        //
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        //
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != max && nums[i] > secondMax) secondMax = nums[i];
            if (nums[i] != min && nums[i] < secondMin) secondMin = nums[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);

    }

        /*
        TASK-5 - findDuplicatedElementsInAnArray() method
        Write a method that takes a String array. Find all duplicated elements and print them.
        NOTE: It is case-sensitive!

        Test data:
        [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]

        Expected output:
        bar
         6
         */

    public static void findDuplicatedElementsInAnArray(String[] str) {

        System.out.println("\n----Task-5----\n");

        for (int i = 0; i < str.length - 1; i++) {

            for (int j = i + 1; j < str.length; j++) {

                if ((str[i].equals(str[j])) && (i != j)) {

                    System.out.println("Duplicate Element is : " + str[j]);
                }

            }

        }

    }

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element and print it.

    Test data:
    [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]

    Expected output:
    pen

     */

    public static void findMostRepeatedElementInAnArray(String[] str) {

        System.out.println("\n----Task-6----\n");

        String repeated = "";
        int count1 = 0;
        int finalCount = 0;

        for (String element : str) {
            count1 = 0;
            for (String element1 : str) {
                if (element.equalsIgnoreCase(element1)) {
                    count1++;
                }
            }
            if (count1 >= finalCount) {
                finalCount = count1;
                repeated = element;
            }
        }
        System.out.println(repeated);

    }

    // Other way doing task-6

    public static void findMostRepeatedElementInAnArray2(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }



    public static void main(String[] args) {

        int[] number = {10, 7, 7, 10, -3, 10, 3};

        Project07.findGreatestAndSmallestWithSort(number);
        Project07.findGreatestAndSmallest(number);

        int[] number1 = {10, 5, 6, 7, 8, 5, 15, 15};
        Project07.findSecondGreatestAndSmallestWithSort(number1);
        Project07.findSecondGreatestAndSmallest(number1);

        String[] str = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        Project07.findDuplicatedElementsInAnArray(str);

        String[] str1 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        Project07.findMostRepeatedElementInAnArray(str1);





    }
}







