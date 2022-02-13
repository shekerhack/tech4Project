package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        1.Create the variables
        2.USe shorthand assignments
        3.Print them out
         */

        int a = 8;
        int b = 3;

        System.out.println("a += b -> " + (a += b)); // --> a = 11 =8+3
        System.out.println("a -= b -> " + (a -= b)); // --> a = 8 = 11-3
        System.out.println("a *= b -> " + (a *= b)); // --> a = 24 = 8*3
        System.out.println("a /= b -> " + (a /= b)); // --> a = 8 = 24/3
        System.out.println("a %= b -> " + (a %= b)); // --> a = 2
    }
}