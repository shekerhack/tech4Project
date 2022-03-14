package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */

        System.out.println("\n--------TASK-1--------\n");

        String s1 = "Today is Tuesday";

        String[] words = s1.split(" ");

        int count = 0;

        for(int i = 0; i < words.length; i++){
            count++;
        }
        System.out.println(count);

        System.out.println("\n--------TASK-1--Other Way------\n");

        String s = "Today is Tuesday"; // {"Today", "is", "Tuesday"}

        int countSpace = 0;

        for (char c : s.toCharArray()) {
            if(c == ' ') countSpace++;
        }

        System.out.println(countSpace+1);

        String[] word = s.split(" ");

        System.out.println(words.length); // 3

          /*
        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        RESULT:
        2
         */

        System.out.println("\n--------TASK-2--------\n");

        String s2 = "Some countries I visited were Argentina, Belgium, and Malts";

        String[] word1 = s2.split(" ");

        int count2 = 0;

        for(String element: word1){
            if(element.toLowerCase().startsWith("a")) count2++;

        }
        System.out.println(count2);





    }
}
