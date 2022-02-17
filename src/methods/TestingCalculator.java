package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args){
        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1, i2); // returns an int

        System.out.println(result); //7


        double d1 = 15, d2 = 2;

        double result2 = Calculator.divide(d1, d2); // returns a double

        System.out.println(result2); // 7.5

        Introduction.introduce("Sheker", "Engineer", 29, "Books");

        int max = Math.max(1, 2);

        double max2 = Math.max(15.2, 10);

        System.out.println(Math.max(15.2, 10)); // this method is a return type
        System.out.println(Calculator.divide(d1, d2)); // this method is also a return type


        //Create a method that finds the sum of 2 int numbers and returns it

        int n1 = 25, n2 = 63;
        int sum1 = Calculator.summary(n1, n2);
        System.out.println("The sum of 2 int numbers is = " + sum1);

        //Create a method that finds the sum of 2 double numbers and returns it

        double s1 = 85, s2 = 99;
        double sum2 = Calculator.summary(s1, s2);
        System.out.println("The sum of 2 double numbers is = " + sum2);











    }
}
