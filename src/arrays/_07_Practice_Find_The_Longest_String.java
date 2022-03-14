package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        /*
        Find the string that has the most characters and print it

        RESULT:
        yellow
         */

        String[] colors = {"red", "blue", "yellow", "brown"};
         String longWord = "";
         for(String str : colors){
             if(str.length() > longWord.length()) longWord = str;
         }
        System.out.println(longWord);



    }
}
