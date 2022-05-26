package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    /*
    TASK-1
    Requirement:
    -Create a method called hasLowerCase()
    -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.

    Test Data 1: “”
    Expected Result 1: false

    Test Data 2: “JAVA”
    Expected Result 2: false

    Test Data 3: “125$”
    Expected Result 3: false

    Test Data 4: “hello”
    Expected Result 4: true
         */

    public static boolean hasLowerCase(String str){

        char[] s = str.toCharArray();
        boolean b = false;

        for(char c : s){
            if(Character.isLowerCase(c)) b = true;
        }
        return b;
    }

    /*
    TASK-2
    -Create a method called noZero()
    -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.

    NOTE: Assume that ArrayList size will be at least 1.

    Test Data 1: [1]
    Expected Result 1: [1]

    Test Data 2: [1, 1, 10]
    Expected Result 2: [1, 1, 10]

    Test Data 3: [0, 1, 10]
    Expected Result 3: [1, 10]

    Test Data 4: [0, 0, 0]
    Expected Result 4: []
     */

    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers) {
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer number : numbers) {
            if (number != 0) num.add(number);
        }
        return num;
    }
        /*
        TASK-3
        -Create a method called numberAndSquare()
        -This method will take an int array argument and it will return a multidimensional array with all numbers squared.

        NOTE: Assume that array size is at least 1.

        Test Data 1: [1, 2, 3]
        Expected Result 1: [[1, 1], [2, 4], [3, 9]]

        Test Data 2: [0, 3, 6]
        Expected Result 2: [[0, 0], [3, 9], [6, 36]]

        Test Data 3: [1, 4]
        Expected Result 3: [[1,1], [4, 16]]
         */

        public static int[][] numberAndSquare(int[] arr){
            int[][] number = new int[arr.length][2];
            for (int i = 0; i < arr.length; i++) {
                number[i][0] = arr[i];
                number[i][1] = arr[i] * arr[i];
            }
            return number;
        }

        /*
        TASK-4
        -Create a method called containsValue()
        -This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
        NOTE: Assume that array size is at least 1.
        NOTE: The method is case-sensitive

        Test Data 1: [“abc”, “foo”, “java”], “hello”
        Expected Result 1: false

        Test Data 2: [“abc”, “def”, “123”], “Abc”
        Expected Result 2: false

        Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
        Expected Result 3: true

        Hint: Use binarySearch() for easy solution
         */

    public static boolean containsValue(String[] arr, String s){
        for(String st : arr){                                //OTHER Way  Arrays.sort(arr);  //return Arrays.binarySearch(arr, s) >= 0;
            if(s.equals(st)) return true;
        }
        return false;
    }

    /*
    TASK-5
    -Create a method called reverseSentence()
    -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.

    NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!

    Test Data 1: “Hello”
    Expected Result 1: “There is not enough words!”

    Test Data 2: “Java is fun”
    Expected Result 2: “Fun is java”

    Test Data 3: “This is a sentence”
    Expected Result 3: “Sentence a is this”

    Hint: Use split() for easy solution
    Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
     */

    public static String reverseSentence(String str){
        String[] container = str.trim().split(" ");
        StringBuilder s = new StringBuilder();

        if (!str.trim().contains(" ")) return "There is not enough words!";

        for (int i = container.length - 1; i >= 0; i--) {
            s.append(container[i] + " ");
        }
        return s.toString().toUpperCase().charAt(0) + s.toString().toLowerCase().substring(1).trim();
    }

    /*
    TASK-6
    -Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.

    Test Data 1: “123Java #$%is fun”
    Expected Result 1: “Java is fun”

    Test Data 2: “Selenium”
    Expected Result 2: “Selenium”

    Test Data 3: “Selenium 123#$%Cypress”
    Expected Result 3: “Selenium Cypress”
     */

    public static String removeStringsSpecialsDigits(String str){
       char[] chars = str.toCharArray();
       String container = "";
       for(char c : chars){
           if(Character.isLetter(c) || Character.isWhitespace(c)) container += c;
       }
       return container;
    }

    /*
    TASK-7
    Create a method called removeArraySpecialsDigits()
    -This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
    NOTE: Assume that array size is at least 1.

    Test Data 1: [“123Java”, “#$%is”, “fun”]
    Expected Result 1: [“Java”, “is”, “fun”]

    Test Data 2: [“Selenium”, “123$%”, “###”]
    Expected Result 2: [“Selenium”, “”, “”]

    Test Data 3: [“Selenium”, “123#$%Cypress”]
    Expected Result 3: [“Selenium”, “Cypress”]
     */

    public static String [] removeArraySpecialsDigits(String[] arr){

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll("[^A-Za-z//s]", "");
        }
        return arr;
    }

    /*
    TASK-8
    Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.

    Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
    Expected Result 1: []

    Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”, “Python”]
    Expected Result 2: [“Java”]

    Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C++”]
    Expected Result 3: [“C#”]
     */

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> unique = new ArrayList<>();
         for(int i = 0; i< arr1.size(); i++){
             for(int j = 0; j < arr2.size(); j++){
                 if (!unique.contains(arr1.get(i)) && arr1.get(i).equals(arr2.get(j))) unique.add(arr1.get(i));
             }
         }
         return unique;
    }

    /*
    TASK-9
    -Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
    If the element itself equals to x or X or contains only x letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.

    Test Data 1: [abc, 123, #$%]
    Expected Result 1: [abc, 123, #$%]

    Test Data 2: [xyz, 123, #$%]
    Expected Result 2: [yz, 123, #$%]

    Test Data 3: [x, 123, #$%]
    Expected Result 3: [123, #$%]

    Test Data 4: [xyXyxy, Xx, ABC]
    Expected Result 4: [yyy, ABC]
     */

    public static ArrayList<String> noXInVariables(ArrayList<String> arr) {
        ArrayList<String> unique = new ArrayList<>();

        for (String str : arr) {
            if (!str.toLowerCase().equals("x")) {
                str = str.replaceAll("[xX]", "");
                unique.add(str);
            }
        }
        return unique;
    }



    public static void main(String[] args) {
        System.out.println("\nTASK-1\n" + hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\nTASK-2\n" + noZero(new ArrayList<>(Arrays.asList(1))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1,1,10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0,1,10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0,0,0))));

        System.out.println("\nTASK-3\n" + Arrays.deepToString(numberAndSquare(new int[] {1,2,3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[] {0,3,6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[] {1,4})));

        System.out.println("\nTASK-4\n" + containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "ABC"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));

        System.out.println("\nTASK-5\n" + reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\nTASK-6\n" + removeStringsSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringsSpecialsDigits("Selenium"));
        System.out.println(removeStringsSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\nTASK-7\n" + Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));


        System.out.println("\nTASK-8\n" + removeAndReturnCommons(new ArrayList<String>(Arrays.asList("Java","is", "fun")), new ArrayList<String>(Arrays.asList("abc", "xyz", "123"))));
        System.out.println(removeAndReturnCommons(new ArrayList<String>(Arrays.asList(new String[]{"Java","is", "fun"})), new ArrayList<String>(Arrays.asList(new String[]{"Java", "C#", "Python"}))));
        System.out.println(removeAndReturnCommons(new ArrayList<String>(Arrays.asList(new String[]{"Java","C#", "C#"})), new ArrayList<String>(Arrays.asList(new String[]{"Python", "C#", "C++"}))));

        System.out.println("\nTASK-9\n" + noXInVariables(new ArrayList<String>(Arrays.asList(new String[] {"abc", "123", "#$%"}))));
        System.out.println(noXInVariables(new ArrayList<String>(Arrays.asList(new String[] {"xyz", "123", "#$%"}))));
        System.out.println(noXInVariables(new ArrayList<String>(Arrays.asList(new String[] {"x", "123", "#$%"}))));
        System.out.println(noXInVariables(new ArrayList<String>(Arrays.asList(new String[] {"xyXyxy", "Xx", "ABC"}))));
    }
}
