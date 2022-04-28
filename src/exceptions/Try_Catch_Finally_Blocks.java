package exceptions;

public class Try_Catch_Finally_Blocks {
    public static void main(String[] args) {

        try{
            System.out.println(3 / 0);
            System.out.println("Hello".charAt(1000));
        }
        catch(Exception se) {
            se.printStackTrace();
        }

        System.out.println("End of the program!");

        // Other way but preferred to use above one

        try{
            System.out.println(3 / 0);
            System.out.println("Hello".charAt(1000));
        }
        catch(StringIndexOutOfBoundsException se) {
            se.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program!");
    }
}
