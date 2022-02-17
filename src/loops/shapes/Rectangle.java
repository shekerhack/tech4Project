package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle

        * * * * *
        *       *
        *       *
        *       *
        *       *
        *       *
        *       *
        * * * * *
         */

        for(int i = 1; i <= 8; i++){
            if (i == 1 || i == 8) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }

        //Other way

        System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");
    }
}
