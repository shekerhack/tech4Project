package operators.arithmeticOperators;

public class ArtithmeticOperators {
    public static void main(String[] args) {

        int number1 = 18; //all number 1 variable down is 18
        int number2 = 15;

        //you can re-assign the same variable but once you put second variable all the way down  variables you used it all belongs  to upper variable. number 1 = 5 all the day down.

        number1 = 5;

        //addition
        int sum = number1 + number2; //33

        //subtraction
        int sub = number1 - number2; //3

        //multiplication
        int times = number1 * number2; //270

        //division
        int div = number1 / number2; //1.2

        //remainder
        int remainder = number1 % number2; //  18 - (15*1) = 3

        System.out.println("addition is = " + sum);
        System.out.println("subtraction is = " +sub);
        System.out.println("multiplication is = " + times);
        System.out.println("division is = " + div);
        System.out.println("remainder is = " + remainder);

    }
}
