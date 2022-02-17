package utilities;

public class MathHelper {

    // Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));

    }


    // method overloading
    public static double maxOfThree(double num1, double num2, double num3){
        return Math.max(num1, Math.max(num2, num3));

    }


    // Create a method that takes 3 byte numbers as arguments and returns the smallest

    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num2, num3));
    }

    //Create a method that finds the absolute difference of 2 int numbers and returns it

    public static int mathAbsolute1(int num01, int num02){
                return  Math.abs(num01 - num02);
    }

    //Create a method that finds the absolute difference of 2 double numbers and returns it

    public static double mathAbsolute2(double num3, double num4){
        return Math.abs(num3 - num4);
    }

    /*
    Please create a method that takes an int as an argument and returns true if it is even returns false if it is odd

    return type
    isEven
    static
    public
     */
    public static boolean isEven(int number){
              return number % 2 == 0;                                 // other way doing it  if(number % 2 == 0) return true;
                                                                     //else return false;
    }
    //Create a method called isOdd() that takes one int parameter and returns true if the number is odd,
    // false otherwise

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    //Create a method that takes on int as an argument and returns if the number is positive.
    //If the number is positive, it will return true
    //Otherwise, it will return false
    // The method name is = isPositive()

    public static boolean isPositive(int number) {
        return number > 0;
    }

        //Create another method called isNegative
        public static boolean isNegative(int number){
            return number < 0;
    }

    //Create another method called isZero

    public static boolean isZero(int number){
        return number == 0;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int birthdayBuffer = isBirthday ? 5 : 0;
        if(speed <= 60 + birthdayBuffer) {
            return 0;
        }
        else if (speed > 60 + birthdayBuffer && speed <= 80 + birthdayBuffer) {
            return 1;
        }
        else {
            return 2;
        }
    }

    }



