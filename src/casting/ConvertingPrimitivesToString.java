package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;
        // + (concatenation)
        // valueOf() method

        String numStr1 = 45 + "" + num; //  4536  // this is also short way of casting primitive to String
        String numStr2 = String.valueOf(num + 45); //81

        System.out.println("numStr1 " + numStr1);
        System.out.println("numStr2 " + numStr2);


    }
}
