package operators.arithmeticOperators;

public class Division {
        public static void main(String[] args) {

            double num1 = 15;
            double num2 = 2;

            double division = num1 / num2;

            System.out.println("num1 / num2 = " + division);

            double num3 = 15;
            double num4 = 2;
            int num5 = 4;
            int num6 = 3;

            double div = num3 / num4;
            double divisionByInt = num3 / num5;
            double divisionByDouble = num6/num4;

            System.out.println("num3 / num4 = " + div);
            System.out.println("num3 / num4 = " + divisionByInt );
            System.out.println("num6 / num4 = " + divisionByDouble);


            double num7 = 15;
            double num8 = 2;
            int num9 = 4;
            int num10 = 3;

            double divi = num7 / num8;
            double diviByInt = num7 / num9;
            double diviByDouble = num10/num8;

            System.out.println("num7 / num8 = " + (15.0 / 3.0)); //double/double
            System.out.println("num7 / num9 = " + (num7 / num9));  //double/int
            System.out.println("num10 / num8 = " + diviByDouble);




        }

}
