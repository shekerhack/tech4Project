package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length); //7

        /*
        Print each element with a message

        EXPECTED OUTPUT:
        Element 1 = A
        Element 2 =
        Element 3 = ,
        Element 4 = #
        Element 5 = T
        Element 6 = 6
        Element 7 = 9
    */
        //        System.out.println("Element = " + chars[0]);
        //        System.out.println("Element = " + chars[1]);
        //        System.out.println("Element = " + chars[2]);
        //        System.out.println("Element = " + chars[3]);
        //        System.out.println("Element = " + chars[4]);
        //        System.out.println("Element = " + chars[5]);
        //        System.out.println("Element = " + chars[6]);

        System.out.println("\n-----fori loop------\n");
        for (int i = 0; i <= chars.length-1; i++) {
            System.out.println("Element = " + chars[i]);
        }

        System.out.println("\n-----for each loop------\n");
        for(char element: chars){
            System.out.println("Element = " + element);
        }





    }
}
