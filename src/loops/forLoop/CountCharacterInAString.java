package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        /*
        Write a Java program to count total number of “o” letter in the given String below:
            String str = “TechGlobal School”;
        Expected output:
        3
         */


        String str = "TechGlobal School";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') count++;
        }
        System.out.println(count); //3


        // below length() counts last letter of School and add = too always

        String str1 = "TechGlobal School";

        int count1 = 0;

        for (int i1 = 0; i1 <= str1.length() - 1; i1++) {

            if (str1.charAt(i1) == 'l') count1++;
        }
        System.out.println(count1); //3
    }
}
