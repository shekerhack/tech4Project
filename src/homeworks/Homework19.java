package homeworks;

import java.util.Arrays;

public class Homework19 {

    // TASK-1
    public static String noDigit(String str){
        return str.replaceAll("[0-9]","");
    }

    // TASK-2
    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // TASK-3
    public static int sumOfDigits(String str){
        int sum = 0;
        char[] c = str.toCharArray();

        for(char c1 : c){
            if(Character.isDigit(c1)) sum += Integer.parseInt("" + c1);
        }
        return sum;
    }

    // TASK-4
    public static boolean hasUpperCase(String str){
        boolean flag = false;
        char[] c2 = str.toCharArray();

        for(char chars : c2){
            if(Character.isUpperCase(chars)) flag = true;
        }
        return flag;
    }

    // TASK-5
    public static int middleInt(int a, int b, int c){
        if ( (a - b) * (c - a) >= 0 ) // a >= b and a <= c OR a <= b and a >= c
            return a;
        else if ( (b - a) * (c - b) >= 0 ) // b >= a and b <= c OR b <= a and b >= c
            return b;
        else
            return c;
    }

    // TASK-6
    public static int[] no13(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    // TASK-7
    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] == 1) arr[i] = 1;
            else{
                int number =  arr[i];
                for (int j = 2; j < number; j++) {
                    arr[i] *= j;
                }
            }
        }
        return arr;
    }

    // TASK-8
    public static String[] categorizeCharacters(String str){
        char[] c = str.toCharArray();
        String letters = "";
        String digits = "";
        String specials = "";
        for(char c1 : c){
            if(Character.isLetter(c1)) letters += c1;
            if(Character.isDigit(c1)) digits += c1;
            else if(!Character.isLetterOrDigit(c1) && !Character.isWhitespace(c1)) specials += c1;
        }
        String[] arr = {letters,digits,specials};
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("\nTASK-1\n" + noDigit("") +
                noDigit("Java") + "\n" + noDigit("123Hello") + "\n" + noDigit("123Hello World149") + "\n" +
                noDigit("123Tech456Global149"));

        System.out.println("\nTASK-2\n" + noVowel("") + "\n" +
                noVowel("xyz") + "\n" + noVowel("JAVA") + "\n" + noVowel("125$") +
                "\n" + noVowel("TechGlobal"));

        System.out.println("\nTASK-3\n" + sumOfDigits("") + "\n" + sumOfDigits("Java") +
                "\n" + sumOfDigits("John's age is 29") + "\n" + sumOfDigits("$125.0"));

        System.out.println("\nTASK-4\n" + hasUpperCase("") + "\n" + hasUpperCase("java") +
                "\n" + hasUpperCase("John's age is 29") + "\n" + hasUpperCase("$125.0"));

        System.out.println("\nTASK-5\n" + middleInt(1,1,1) + "\n" +
                middleInt(1,2,2) + "\n" + middleInt(5,5,8) +
                "\n" + middleInt(5,3,5) + "\n" + middleInt(-1,25,10));

        System.out.println("\nTASK-6\n" + Arrays.toString(no13(new int[]{1,2,3,4})) + "\n" +
                Arrays.toString(no13(new int[]{13,2,3})) + "\n" + Arrays.toString(no13(new int[]{13,13,13,13,13})));

        System.out.println("\nTASK-7\n" + Arrays.toString(arrFactorial(new int[]{1,2,3,4})) + "\n" +
                Arrays.toString(arrFactorial(new int[]{0,2,4,1})) + "\n" + Arrays.toString(arrFactorial(new int[]{5,0,6})));

        System.out.println("\nTASK-8\n" + Arrays.toString(categorizeCharacters("  ")) + "\n" +
                Arrays.toString(categorizeCharacters("abc123$#%")) + "\n" + Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }
}
