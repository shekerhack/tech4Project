package stringMethods;

public class _01_valueOf {
    public static void main(String[] args){
        /*
        Method Task: Convert given variable to a String
        -It is a static- you can call it with a class name. We called it with String.valueOf that's why.
        -It is a return type, and it returns a String
        -It takes different arguments as it is overloaded method and converts given args to a String
         */

        int i = 5; // it is mathematic number

        String num = String.valueOf(i); // num = 5 it is text

        System.out.println(i + i); //10
        System.out.println(num + num + ""); //55 it means text
    }

}
