package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class Homework22 {

    /*
    -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
    Test Data 1: 3
    Expected Result 1: [0, 1, 1,]

    Test Data 2: 5
    Expected Result 2: [0, 1, 1, 2, 3]

    Test Data 3: 7
    Expected Result 3: [0, 1, 1, 2, 3, 5, 8]
     */

    public static int[] fibonacciSeries1(int n){
        int[] arr = new int[n];
        int n1 = 0, n2 =1, total = 0;
        for(int i = 0; i < arr.length; i++){
           arr[i] += n1;
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        return arr;
    }

    /*
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
    Test Data 1: 2
    Expected Result 1: 1

    Test Data 2: 4
    Expected Result 2: 2

    Test Data 3: 8
    Expected Result 3: 13
     */

    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];
        int n1 = 0, n2 = 1, total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n1;
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        return arr[arr.length - 1];
    }

    /*
    Create a method called findUniques()
    -This method will take 2 int array argument and it will return an int array which has only the unique values from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.
    Test Data 1: [], []
    Expected Result 1: []

    Test Data 2: [], [1, 2, 3, 2]
    Expected Result 2: [1, 2, 3]

    Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
    Expected Result 3: [1, 2, 5]

    Test Data 4: [8, 9], [9, 8, 9]
    Expected Result 4: []
     */

    public static int[] findUniques(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) list.add(arr1[i]);
            else contains = false;
        }
        int[] arrays = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arrays[i] = list.get(i);
        }
            return arrays;
        }

        // Jonathan's mentoring

    // TASK-3
    public static int[] findUniques2(int[] arr1, int[] arr2){
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().toArray();
    }


        /*
        Create a method called isPowerOf3()
    -This method will take an int argument and it will return true if given int argument is equal to 3 power of the X. Otherwise, it will return false.
    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….
    Test Data 1: 1
    Expected Result 1: true

    Test Data 2: 2
    Expected Result 2: false

    Test Data 3: 3
    Expected Result 3: true

    Test Data 4: 81
    Expected Result 4: true
         */

    public static boolean isPowerOf3(int number){
        if(number == 1) return true;
        else return (number % 3 == 0);
    }

    /*
    Create a method called firstDuplicate()
    -This method will take an int array argument and it will return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return the one for which second occurrence has the smallest index.
    Test Data 1: []
    Expected Result 1: -1
    Test Data 2: [1]
    Expected Result 2: -1
    Test Data 3: [1, 2, 2, 3]
    Expected Result 3: 2
    Test Data 4: [1, 2, 3, 3, 4, 1]
    Expected Result 4: 3
     */

    public static int firstDuplicate(int[] array){
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < array.length; i++){
            int n = array[i];
            if(map.contains(n)) return n;
            map.add(n);
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println("\nTASK-1\n" + Arrays.toString(fibonacciSeries1(3)) +
                "\n" + Arrays.toString(fibonacciSeries1(5)) + "\n" + Arrays.toString(fibonacciSeries1(7)));

        System.out.println("\nTASK-2\n" + fibonacciSeries2(2) +
                "\n" + fibonacciSeries2(4) + "\n" + fibonacciSeries2(8));

        System.out.println("\nTASK-3\n" + Arrays.toString(findUniques(new int[]{}, new int[]{})) +
                "\n" + Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})) +
                "\n" + Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})) +
                "\n" + Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\nTASK-3\n" + Arrays.toString(findUniques2(new int[]{}, new int[]{})) +
                "\n" + Arrays.toString(findUniques2(new int[]{}, new int[]{1, 2, 3, 2})) +
                "\n" + Arrays.toString(findUniques2(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})) +
                "\n" + Arrays.toString(findUniques2(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\nTASK-4\n" + isPowerOf3(1) + "\n" + isPowerOf3(2) +
                "\n" + isPowerOf3(3) + "\n" + isPowerOf3(81));

        System.out.println("\nTASK-5\n" + firstDuplicate(new int[]{}) +
                "\n" + firstDuplicate(new int[]{1}) + "\n" + firstDuplicate(new int[]{1, 2, 2, 3}) +
                "\n" + firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));


    }
}
