package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-z]+", "hello")); //true + plus means if it is more than one time
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class")); // false because sentence has space it is not whole word
        System.out.println(Pattern.matches("[a-zA-Z ]{3,}", "hello class")); // true because space is allowed
        System.out.println(Pattern.matches("[a-zA-z0-9_-]{8,15}", "TechGlobal")); //true

        //Write a regex pattern for a phone number with the format of: (XXX)-XXX-XXXX

        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(123)-456-7890")); // true
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}","(806)-551-3112"));
        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(708)-456-7890"));
    }
}
