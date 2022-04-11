package Homeworks;

import java.util.*;

public class Homework16 {

       /*
       TASK-1
       Write a method countWords() that takes a String as an argument, and returns how many words there are in the the given String

        Test data 1:
        String str = “      Java is fun       ”;

        Expected output 1:
        3

        Test data 2:
        String str = “Selenium is the most common UI automation tool.   ”;

        Expected output 2:
        8

        NOTE: Make your code dynamic that works for any given String
        NOTE: Be careful about empty String
        NOTE: Be careful about before and after white spaces
        */

        public static int countWords(String str){
            String trim = str.trim();
            if (trim.isEmpty())
                return 0;
            return trim.split(" ").length; // separate string around space
    }

    /*
    TASK-2
       Write a method countA() that takes a String as an argument, and returns how many A or a there are in the the given String

        Test data 1:
        String str = “TechGlobal is a QA bootcamp”;
        Expected output 1:
        4
        Test data 2:
        String str = “QA stands for Quality Assurance”;
        Expected output 2:
        5


        NOTE: Make your code dynamic that works for any given String
        NOTE: Be careful about empty String
        NOTE: Be careful about uppercase and lowercase

     */

    public static int countA(String str){

        int countALetter = str.length();
        int countAfterRemovingA = str.toLowerCase().replace("a", "").length();
        int totalCountA = countALetter - countAfterRemovingA;
        return totalCountA;
    }

    /*
    TASK-3
    Write a method countPos() that takes an ArrayList of Integer as an argument, and returns how many elements are positive

    Test data 1:
    [-45, 0, 0, 34, 5, 67]

    Expected output 1:
    3

    Test data 2:
    [-23, -4, 0, 2, 5, 90, 123]

    Expected output 2:
    4

    NOTE: Make your code dynamic that works for any given ArrayList of Integer

         */

    public static int countPos(ArrayList<Integer> numbers){
       List<Integer> arr = new ArrayList<>(numbers);
        int countPositive = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0) countPositive++;
        }
        return countPositive;
    }

    /*
    TASK-4
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument, and returns it back with removed duplicates

    Test data 1:
    [10, 20, 35, 20, 35, 60, 70, 60]

    Expected output 1:
    [10, 20, 35, 60, 70]

    Test data 2:
    [1, 2, 5, 2, 3]

    Expected output 2:
    [1, 2, 5, 3]

    NOTE: Make your code dynamic that works for any given ArrayList of Integer

     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer element : numbers) {
            if(!unique.contains(element)) unique.add(element);
        }
        return unique;
    }

    /*
    TASK-5
    Requirement:
    Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates

    Test data 1:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]

    Expected output 1:
    [“java”, “C#”, “ruby”, “JAVA”,  “C++”]

    Test data 2:
    [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]

    Expected output 2:
    [“abc”, “xyz”, “123”, “ab”, “ABC”]

    NOTE: Make your code dynamic that works for any given ArrayList of String
    NOTE: Be careful about lowercase and uppercases, this method is case sensitive

     */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> duplicate = new ArrayList<>();

        for(String s : str){
            if(!duplicate.contains(s)) duplicate.add(s);
        }
        return duplicate;
    }

    /*
    TASK-6
    Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces

    Test data 1:
    String str = “   I   am      learning     Java      ”;

    Expected output 1:
    I am learning Java

    Test data 2:
    String str = “Java  is fun    ”;

    Expected output 2:
    Java is fun

    NOTE: Make your code dynamic that works for any given String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white spaces
     */

    public static String removeExtraSpaces(String str) {

        String noExtraSpace = str;

        while (noExtraSpace.contains("  ")) {
            noExtraSpace = noExtraSpace.trim().replace("  ", " ");
        }
        return noExtraSpace;
    }

    /*
    TASK-7
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};

    Expected output 1:
    [9, 3, 2, 7, 5, 10]

    Test data 1:
    int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
    int[] arr2 = {10, 3, 6, 3, 2};

    Expected output 1:
    [16, 11, 9,  3, 2, 7, 5, 10, 34]

    NOTE: Make your code dynamic that works for any given arrays
    NOTE: You will assume that length of arrays are always more than zero
    NOTE: Be careful about arrays length, if they were equal, it would be an easy task, but they can be different as given in the example above.
     */

    public static int[] sumOfTwoIntArrays(int[] arr1, int[] arr2) {

        int[] biggerArray = arr1.length > arr2.length ? arr1 : arr2;
        int[] smallerArray = arr1.length <= arr2.length ? arr1 : arr2;

        int[] summedArray = new int[biggerArray.length];
        System.arraycopy(biggerArray, 0, summedArray, 0, biggerArray.length);

        for (int i = 0; i < smallerArray.length; i++) {
            summedArray[i] += smallerArray[i];
        }

        for (int i = 0; i < summedArray.length; i++) {

        }
        return (summedArray);

    }

    /*
    TASK-8
    Requirement:
    Write a method findClosestTo10() that takes an int[] array as an argument, and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8

    NOTE: You will assume that length of array is always more than zero
    NOTE: Make your code dynamic that works for any given int[] array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in this case return smallest which is 8
     */

    public static int findClosestTo10(int[] number) {

        int closest = number[0]; //index of 0

        int distance = Math.abs(number[0] - 10);

        for (int i = 1; i < number.length; i++) {
            if (Math.abs(number[i] - 10) < distance) {
                distance = Math.abs(number[i] - 10);
                closest = number[i];
            } else if (Math.abs(number[i] - 10) == distance) {
                if (closest > number[i]) closest = number[i];
            }
        }
        return closest;

    }



    public static void main(String[] args) {

        System.out.println("\n-----Task-1----\n");

        String str = "Selenium is the most common UI automation tool.   ";
        System.out.println(Homework16.countWords(str));

        System.out.println("\n-----Task-2----\n");

        String str2 = "QA stands for Quality Assurance";
        System.out.println(Homework16.countA(str2));

        System.out.println("\n-----Task-3----\n");

        System.out.println(countPos(new ArrayList<Integer>(Arrays.asList(-45, 0, 0, 34, 5, 67))));

        System.out.println("\n-----Task-4----\n");

        System.out.println(removeDuplicateNumbers(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 2, 3))));

        System.out.println("\n-----Task-5----\n");

        System.out.println(removeDuplicateElements(new ArrayList<String>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"))));

        System.out.println("\n-----Task-6----\n");

        System.out.println(removeExtraSpaces(new String("   I   am      learning     Java      ")));

        System.out.println("\n-----Task-7----\n");
        int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr2 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(sumOfTwoIntArrays(arr1, arr2)));


        System.out.println("\n-----Task-8----\n");

        int num1[] = {10, -13, 5, 70, 15, 57};

        System.out.println(findClosestTo10(num1));









    }
}
