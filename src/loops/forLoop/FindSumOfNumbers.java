package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write of Java program to find sum of the numbers from 10 to 15(10 and 15 are included)
        10 + 11 + 12 + 13 + 14 + 15

        Expected output:
        75
         */

        int sum = 0;

        for(int i = 10; i <=15; i++){
            sum += i; //10
            System.out.println(sum);
        }
    }
}
