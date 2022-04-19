package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        // Removing vowels
        String str = "Hello World";
        System.out.println("Before: " + str);

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After: " + str);

        //Removing Digits

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]", "");
        System.out.println(str2);

        // Removing vowels and replacing with $ dollar sign
        String str3 = "Hello World";
        System.out.println("Before: " + str3);

        str3 = str3.replaceAll("[aeiouAEIOU]", "\\$");
        System.out.println("After: " + str3);

        // Remove all special characters
        String str4 = " abc 123 $#^ ";
        str4 = str4.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str4);

    }
}
