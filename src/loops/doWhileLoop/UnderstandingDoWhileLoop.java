package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {

        Random random = new Random();
        boolean b = random.nextBoolean(); //true or false


        // if it is true(it is random you don't know exactly)
        while (b) {
            System.out.println("It is true");
            b = random.nextBoolean();
        }
        System.out.println("End of the program");



        // another example

        boolean bo = true;

        while (b){
            System.out.println("true");
            b = false;
        }
        System.out.println("End of the program");

        // do while example

        boolean b2 = false;

        do{
            System.out.println("true");
        }while(b2);


    }
}
