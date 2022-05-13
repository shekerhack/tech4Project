package homeworks;
import java.util.ArrayList;
import java.util.Arrays;
public class Homework14 {
    public static void main(String[] args) {

        /*
        Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.

        Test data 1:
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        Expected output 1:
        0

        Test data 2:
        int[] numbers = {-8, 56, 7, 8, 65};

        Expected output 2:
        There is no duplicates

        Test data 3:
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        Expected output 2:
        3
         */

        System.out.println("\n-----Task-1----\n");
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        int firstDuplicateNumber = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (i != j)) {
                    firstDuplicateNumber = firstDuplicateNumber + 1;
                    System.out.println(numbers[j]);
                    break;

                }
            }
            if (firstDuplicateNumber > 0) {
                break;

            }

        }
        if (firstDuplicateNumber == 0) System.out.println("There is no duplicates");

        /*
        Write a program to find the first duplicated String in a String array, ignore cases. It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.

        Test data 1:
        String[] words = {“Z”, “abc”, “z”, “123”, “#” };

        Expected output 1:
        Z

        Test data 2:
        String[] words = {“xyz”, “java”, ”abc”};

        Expected output 2:
        There is no duplicates

        Test data 3:
        String[] words = {“a”, “b”, “B”, “XYZ”, “123”};

        Expected output 2:
        b
         */

        System.out.println("\n-----Task-2----\n");

        String[] words = {"a", "b", "B", "XYZ", "123"};

        int countStringFirstDuplicate = 0;

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    countStringFirstDuplicate = countStringFirstDuplicate + 1;
                    System.out.println(words[i]);
                }
            }if(countStringFirstDuplicate > 0){
                break;
            }
        }

        if(countStringFirstDuplicate == 0) System.out.println("There is no duplicates");

        /*
        Write a program to find the all duplicates in an int array. It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.

        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        Expected output 1:
        0
        -7

        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};

        Expected output 2:
        There is no duplicates
         */

        System.out.println("\n-----Task-3----\n");

        int[] numbers2 = {0, -4, -7, 0, 5, 10, 45, -7, 0, 0, -7};

        String s = "";

        for(int i = 0; i < numbers2.length - 1; i++){
            for(int j = i + 1; j < numbers2.length; j++){
                if(numbers2[i] == numbers2[j] && !s.contains(numbers2[i] + "")){
                    s += numbers2[i] + "\n";
                }
            }
        }

       // if(s.isEmpty()) System.out.println("There is no duplicates");
       // else System.out.println(s);

        // Turnery operator version
       System.out.println((s.isEmpty()) ? "There is no duplicates" : s);


        System.out.println("\n-----Task-3--Other Way With ArrayList--\n");

        //int[] numbers2 = {0, -4, -7, 0, 5, 10, 45, -7, 0, 0, -7};

        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int i = 0; i < numbers2.length - 1; i++){
            for(int j = i + 1; j < numbers2.length; j++){
                if(numbers2[i] == numbers2[j] && !duplicates.contains(numbers2[i])){
                   duplicates.add(numbers2[i]);
                }
            }
        }
        if(duplicates.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer duplicate : duplicates) System.out.println(duplicate);


        /*
        Write a program to find the all duplicates in a String array, ignore cases. It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.

        Test data 1:
        String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”, “java”};

        Expected output 1:
        A
        foo

        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };

        Expected output 2:
        There is no duplicates
                 */

        System.out.println("\n-----Task-4----\n");

        String[] words2 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};

        String str1 = "";

        for(int i = 0; i < words2.length - 1; i++){
            for(int j = i + 1; j < words2.length; j++){
                if(words2[i].equalsIgnoreCase(words2[j]) && !str1.contains(words2[i].toLowerCase())){
                    System.out.println(words2[i]);
                    str1 += words2[i].toLowerCase();
                }
            }
        }

         if(str1.isEmpty()) System.out.println("There is no duplicates");




        /*
        Write a program to reverse elements in an array, then print array.
        NOTE: Make your code dynamic that works for any given array.

        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};

        Expected output 1:
        [bar, foo, abc]

        Test data 2:
        String[] words2 = {“java”, “python”, “ruby”};

        Expected output 2:
        [ruby, python, java]
         */

        System.out.println("\n-----Task-5----\n");
        String[] words1 = {"abc", "foo", "bar"};
        String[] reverseWord1 = new String[words1.length]; //[bar, foo, abc]

        for(int i = 0; i < words1.length; i++){
            reverseWord1[i] = words1[words1.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseWord1));

        System.out.println("\n-----Task-5-Other Way---\n");

        System.out.print("[");

        for(int i = words1.length - 1; i >= 0; i--){
            if(i == 0)System.out.print(words1[i] + ",");
            else System.out.print(words1[i] + ",");
        }
        System.out.println("]");

                  /*
                  Write a program to reverse each word in a given String
                NOTE: Make your code dynamic that works for any given String.

                Test data 1:
                String str = “Java is fun”;

                Expected output 1:
                avaJ si nuf

                Test data 2:
                String str = “Today is a fun day”;

                Expected output 2:
                yadoT si a nuf yad
                   */

        System.out.println("\n-----Task-6----\n");

        String str = "Today is a fun day";


        String[] words3 = str.split(" ");
        String reversed = "";

        for(String w : words3){
            String reversedWord = "";
            for(int i = w.length() - 1; i >= 0; i--){
                reversedWord += w.charAt(i);
            }
            reversed = reversed + reversedWord + " "; //avaJ si nuf
        }
        System.out.println(reversed);


        }

        }


