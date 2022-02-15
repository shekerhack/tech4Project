package mathClass;

public class FIndAbs {
    public static void main(String[] args) {

        char c = (char)Math.abs(6-10);
        char b = 4;

        int d = Math.abs(6-10);

        int abs = Math.abs(6 - 10 + 4 + 1 + 65 -34);
        //int abs Math.abs(32); same thing
        // int abs2 = Math.abs(5, 7); not gonna work

        System.out.println(Math.abs(6-10));
        System.out.println(abs);

        int x = 5;
        int y = 34;

        System.out.println(Math.abs(y - x));

    }
}
