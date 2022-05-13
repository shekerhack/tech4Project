package homeworks;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4_Homework18 {
    /*
    Task-1
    -Create a method called noSpace()
    -This method will take one String argument and it will return a new String with all spaces removed from the original String

    Test Data 1: “ Hello World   ”
    Expected Result 4: “HelloWorld”

    Test Data 2: “Tech Global”
    Expected Result 5: “TechGlobal”
     */

    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }

    public static String noSpace2(String str){
        String result = "";
        for (int i = 0; i <str.length(); i++){
            if (!Character.isWhitespace(str.charAt(i))) result += str.charAt(i);
        }
        return result;
    }

    public static String noSpace3(String str){
        String result = "";
        for (char element : str.toCharArray()){
            if (element != ' ') result += element;
        }
        return result;
    }

    /*
    Task-2
    -Create a method called replaceFirstLast()
    -This method will take one String argument and it will return a new String with first and last characters replaced

     NOTE: if the length is less than 2, then return empty String
     NOTE: Ignore all before and after spaces (get actual String only)

     Test Data 1: “”
     Expected Result 1: “”

     Test Data 2: “A”
     Expected Result 2: “”

     Test Data 3: “    A       ”
     Expected Result 3: “”

     Test Data 4: “Hello”
     Expected Result 4: “oellH”

    Test Data 5: “Tech Global”
    Expected Result 5: “lech GlobaT”
     */

    public static String replaceFirstLast(String str) {
        String s = "";

        if (str.trim().length() < 2) return s;

        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        // Other Way: return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1); // Confusing
    }

    /*
    Task-3
    Create a method called hasVowel()
    -This method will take one String argument and it will return a boolean checking if String has any vowel or not

    NOTE: Vowels are = a, e, o, u, I
    NOTE: Ignore cases

    Test Data 1: “”
    Expected Result 1: false

    Test Data 2: “Java”
    Expected Result 2: true

    Test Data 3: “1234”
    Expected Result 3: false

    Test Data 4: “ABC”
    Expected Result 4: true
     */

    public static boolean hasVowel(String str){

        if(str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u") || str.toLowerCase().contains("i")) return true;
        else return false;
    }

    /*
    Task-4
    Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument and it will print message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.

    Test Data 1: 2006
    Expected Result 1: AGE IS ALLOWED

    Test Data 2: 2005
    Expected Result 2: AGE IS ALLOWED

    Test Data 3: 2050
    Expected Result 3: AGE IS NOT VALID

    Test Data 4: 1920
    Expected Result 4: AGE IS NOT VALID

    Test Data 5: 1800
    Expected Result 5: AGE IS NOT VALID
     */

    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int age = Integer.parseInt(sdf.format(date)) - yearOfBirth;

        if(age > 100 || age < 0) System.out.println("AGE IS NOT VALID");
        else if(age >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }

    /*
    Task-5
    Create a method called averageOfEdges()
    -This method will take three int arguments and it will return average of min and max numbers

    Test Data 1: 0, 0 ,0
    Expected Result 1: 0

    Test Data 2: 0, 0, 6
    Expected Result 2: 3

    Test Data 3: -2, -2, 10
    Expected Result 3: 4

    Test Data 4: -3, 15, -3
    Expected Result 4: 6

    Test Data 4: 10, 13, 20
    Expected Result 4: 15
     */

    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        return (max + min) / 2;
    }

    /*
    Task-6
    Create a method called noA()
    -This method will take a String array argument and it will return a new array with all elements starting with A or a replaced with “###”

    NOTE: Assume length will always be more than zero
    NOTE: Ignore cases

    Test Data 1: [“java”, “hello”, “123”, “xyz”]
    Expected Result 1: [“java”, “hello”, “123”, “xyz”]

    Test Data 2: [“appium”, “123”, “ABC”, “java”]
    Expected Result 2: [“###”, “123”, “###”, “java”]

    Test Data 3: [“apple”, “appium”, “ABC”, “Alex”, “A”]
    Expected Result 3: [“###”, “###”, “###”, “###”, “###”]
     */

    public static String[] noA(String[] arr){
       String[] str = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i].toLowerCase().startsWith("a")) str[i] = "###";
             else str[i] = arr[i];
        }
        return str;
    }

    /*
    Task-7
    Create a method called no3or5()
    -This method will take an int array argument and it will return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101

    NOTE: Assume length will always be more than zero

    Test Data 1: [7, 4, 11, 23, 17]
    Expected Result 1: [7, 4, 11, 23, 17]

    Test Data 2: [3, 4, 5, 6]
    Expected Result 2: [100, 4, 99, 100]

    Test Data 3: [10, 11, 12, 13, 14, 15]
    Expected Result 3:  [99, 11, 100, 13, 14, 101]
         */

    public static int[] no3or5(int[]arr){
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 15 == 0) newArr[i] = 101;
            else if(arr[i] % 5 == 0) newArr[i] = 99;
            else if(arr[i] % 3 == 0) newArr[i] = 100;
            else newArr[i] = arr[i];
        }
        return newArr;
    }

    /*
    Task-8
    -Create a method called countPrimes()
    -This method will take an int array argument and it will return how many elements in the array are prime numbers

    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2

    Test Data 1: [-10, -3, 0, 1]
    Expected Result 1: 0

    Test Data 2: [7, 4, 11, 23, 17]
    Expected Result 2: 4

    Test Data 3: [41, 53, 19, 47, 67]
    Expected Result 3:  5
     */

    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number == 2 || number == 3) count++;
            else if (number > 3) {
                boolean b = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("\nTask-1\n" + noSpace("Tech Global"));
        System.out.println("\nTask-2\n" + replaceFirstLast("Tech Global"));
        System.out.println("\nTask-3\n" + hasVowel(""));
        System.out.println("\nTask-4");
        checkAge(1800);
        System.out.println("\nTask-5\n" + averageOfEdges(10,13,20));
        System.out.println("\nTask-6\n" + Arrays.toString(noA(new String[] {"apple","appium", "ABC", "Alex", "A"})));
        System.out.println("\nTask-7\n" + Arrays.toString(no3or5(new int[]{10,11,12,13,14,15})));
        System.out.println("\nTask-8\n" + countPrimes(new int[]{41, 53, 19, 47, 67}));

    }
}
