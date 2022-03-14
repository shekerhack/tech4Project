package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        First even = 0
        First odd = 5
         */

        boolean isFirstEvenFound = false;

        int firstEven = 0;
        int firstOdd = 0;

        for (int element : numbers) {
            if (element % 2 == 0) {
                isFirstEvenFound = true;
                firstEven = element;
                break;
            }
        }

        if (isFirstEvenFound) System.out.println(firstEven);
        else System.out.println("There is no even number in this array");

        // Other way
        int countEven = 0;
        int countOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            } else if (number % 2 == 1 && countOdd == 0) {
                System.out.println("First odd number is: " + number);
                countOdd++;
            }
        }

        // Other way
        boolean isFirstEvenFound1 = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if(number % 2 == 0 && !isFirstEvenFound1) {
                isFirstEvenFound1 = true;
                System.out.println("First Even = " + number);
            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First Odd = " + number);
            }

            if(isFirstEvenFound1 && isFirstOddFound) break;
        }

        if(!isFirstEvenFound1) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");
    }
}
