package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;


        try{
            System.out.println(number / 3); // 15
            System.out.println(number / 0); // ArithmeticException

            System.out.println("abc".charAt(15));
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program!");
    }
}
