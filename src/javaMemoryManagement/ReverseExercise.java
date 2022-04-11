package javaMemoryManagement;

public class ReverseExercise {

    /*
    Write a method that takes a String and returns it reversed

    Hello -> olleH

    reverse -> ""
    reverse -> "o"
    reverse -> "l"
    reverse -> "l"
    reverse -> "e"
    reverse -> "H"
     */

    // Loop logic
    public static String reverseWithLoop(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

        public static String reverseWithStringBuilder(String str) {
            StringBuilder sb = new StringBuilder(str);

            sb.reverse();
            return sb.toString();
        }
            //Other short way
            // return new StringBuilder(str).reverse().toString();

            /*
            Create a method that takes a String and check if it is a palindrome
            If palindrome, return false
            Otherwise return false;
             */

            public static boolean isPalindromeWithStringBuilder(String str){
                return str.equals(new StringBuilder(str).reverse().toString());

    }


    public static void main(String[] args) {

        System.out.println(reverseWithLoop("Hello"));
        System.out.println(reverseWithLoop("World"));


        System.out.println(reverseWithStringBuilder("Sheker"));
        System.out.println(reverseWithStringBuilder("Ilkin"));
        System.out.println(reverseWithStringBuilder("Erkin"));

        System.out.println(isPalindromeWithStringBuilder("madam")); // true
        System.out.println(isPalindromeWithStringBuilder("123321")); // false
        System.out.println(isPalindromeWithStringBuilder("Madam")); // true



    }
}
