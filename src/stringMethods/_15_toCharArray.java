package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java";  // [J, a, v, a]
        char[] chars = "Java".toCharArray();

        System.out.println(Arrays.toString(chars));

        System.out.println(Arrays.toString("Hello".toCharArray()));  // [H, e, l, l, o]

        int countA = 0;

        for (char element : chars) {
            if(element == 'a') countA++;
        }

        System.out.println(countA);

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]
    }
}
