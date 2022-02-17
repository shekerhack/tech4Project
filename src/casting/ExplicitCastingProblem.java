package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int num = 150;
        byte b = (byte) num;

        System.out.println(b);// 106 why -106 because byte can take max 127 and min -128. (-128= 128, if our number would be 129=127 it will return this, if our number would be 130=126 it will return this
    }
}
