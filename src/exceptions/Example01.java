package exceptions;

public class Example01 {

    public static void main(String[] args) {
        /*
       Handle the exception below and report with a message
         */

        String[] names ={"Alex", "John", "Max"};

        try {
            System.out.println(names[-5]); // ArrayIndexOutOfBoundsException
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program!");
    }
}
