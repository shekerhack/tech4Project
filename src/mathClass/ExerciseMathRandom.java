package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        /* Create a program which is generating a random number between 45-98 and print it out.

        (int) (Math.random() * (endPoint - startPoint + 1) + startPoint);
                                  98 - 45 + 1=54
         */
        System.out.println(
                (int) (Math.random() * 54 + 45)
        );

        /* Create a program which is generating two random number between 67 - 85 and print it out the number1 and number2 and max and min.
           64 - 85 + 1 =19
         */
        int random1 = (int)(Math.random() * 19 + 67);
        int random2 = (int)(Math.random() * 19 + 67);

        System.out.println("\n\nFirst number is = " + random1 +
                "\nSecond number is = " + random2 + "\nMax of two number is = " + Math.max(random1, random2) +
                "\nMin of two number is = " + Math.min(random1, random2));
    }
}
