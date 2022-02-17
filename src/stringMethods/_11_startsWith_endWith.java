package stringMethods;

import java.util.Locale;

public class _11_startsWith_endWith {
    public static void main(String[] args) {
        /*

         */

        String str = "Today is Sunday";

        System.out.println(str.startsWith("Today")); // true
        System.out.println(str.startsWith("today")); // false
        System.out.println(str.endsWith("day")); // true

        System.out.println(str.toUpperCase().endsWith("Sunday")); //true

        System.out.println(str.startsWith("is", 6)); // true

        // System.out.println("Hello".startsWith('H')); // compiler error

    }
}
