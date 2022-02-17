package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {

       // Math.max(5, 1, 5)); //compiler error

        int max = MathHelper.maxOfThree(5,2,6);

        System.out.println("Max of three numbers = " + max);

        System.out.println(MathHelper.maxOfThree(1.1, 1.2, 1.3));  //1.3

        byte b1 = (byte)(Math.random() * 10);
        byte b2 = (byte)(Math.random() * 10);
        byte b3 = (byte)(Math.random() * 10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);

        System.out.println(MathHelper.minOfThree(b1, b2, b3));



        //Create a method that finds the absolute difference of 2 int numbers and returns it

        int num1 = 85, num2 =63;
        int absolute1 = MathHelper.mathAbsolute1(num1, num2);
        System.out.println("The difference between of 2 int numbers is = " + absolute1);

        //Create a method that finds the absolute difference of 2 double numbers and returns it

        double num01= 12, num02 = 85;
        double absolute2 = MathHelper.mathAbsolute2(num1, num2);
        System.out.println("The difference between of 2 double numbers is = " + absolute2);



    }
}
