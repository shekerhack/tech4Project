package recursion;

public class _03_ReverseString {
    /*
    Write a recursive method to reverse a given String

    str = "Apple"

    Expected:
    elppA
     */

    // e + l + p + p + A -> elppA

    public static String recursionReverseString(String str){
        if (str.length() <= 1) return str;
        // (str.isEmpty()) will work too

        return recursionReverseString(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(recursionReverseString("Apple")); // elppA
    }
}
