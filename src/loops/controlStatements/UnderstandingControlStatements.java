package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        Write a program that prints all number bt 1 to 25
        But skip the numbers that can be divided by 10
        Now, do not print any number that more than 15
         */

        for(int i = 1; i <= 25; i++){
            if(i % 10 != 0) System.out.println(i );
        }

        // But skip the numbers that can be divided by 10
        //using continue control statement to skip numbers that can be divided by 10
        for(int i1 = 1; i1 <= 25; i1++){
            if(i1 % 10 == 0) continue;
                else System.out.println(i1);
            }

        // Now, do not print any number that more than 15
        for(int i2 = 1; i2 <= 25; i2++) {
            if (i2 % 10 == 0) {
                continue; //this means it goes at the beginning and goes to next iteration (povtoreniye)
            }
            else {
                System.out.println(i2);
            }
            if (i2 == 15) {
                break;
            }
        }
        System.out.println("End of the program");


    }
}
