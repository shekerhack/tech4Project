package loops.forLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers from 1 to 10 (1 and 10 are included)
        Expected output:
        1
        2
        .
        .
        .
        8
        9
        10
        start point: 1
        end point  : 10
        update     : increment
         */

        int i = 1;

        System.out.println( i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);

        //loop way
        // start point:1
       // end pont: 10
        // update :increment

        for(int i1 = 1; i1 <= 10; i++){
            System.out.println(i1);
        }



    }
}
