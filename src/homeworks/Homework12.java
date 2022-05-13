package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        /*
        Task-1
        Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0

        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 9
        -Print the entire array

        Expected Result:
        0
        89
        7
        [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */

        System.out.println("\n----Task-1----\n");

        int[] number1 = new int[10];
        number1[2] = 23;
        number1 [4] = 12;
        number1 [7] = 34;
        number1 [9] = 7;
        number1 [6] = 15;
        number1 [0] = 89;
        System.out.println(number1[3]);
        System.out.println(number1[0]);
        System.out.println(number1[9]);

        /*
        Task-2
        -Create a String array having size of 5
        -Assign “abc” to index of 1
        -Assign “xyz” to index of 4

        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 4
        -Print the entire array

        Expected Result:
        null
        null
        xyz
        [null, abc, null, null, xyz]
                */

        System.out.println("\n----Task-2----\n");

        String[] str = new String[5];
        str [1] = "abc";
        str [4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        /*
        Task-3
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100

        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order

        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
        */

        System.out.println("\n----Task-3----\n");

        int[] number2 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(number2));

        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));

        /*
        Task-4
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania

        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically

        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]
                 */

        System.out.println("\n----Task-4----\n");

        String[] str2 = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(str2));

        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));

        /*
        Task-5
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky

        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
            if it contains Pluto, then print true
            if it does not contain Pluto, print false

        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */

        System.out.println("\n----Task-5----\n");

        String[] str3 = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(str3));

        boolean pluto = false;

        for(String dogs : str3){
            if(dogs.contains("Pluto")){
                pluto = true;
                break;
            }

        }
        System.out.println(pluto);

        /*
        Task-6
        -Create a String array that stores cartoon cats below
        Garfield, Tom, Sylvester, Azrael

        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
            if it contains both, then print true
            if it does not contain both, print false

        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false

         */

        System.out.println("\n----Task-6----\n");

        String[] str4 = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(str4);
        System.out.println(Arrays.toString(str4));

        boolean cartoonCats = false;
        for(String cats : str4){
            if(cats.equals("Garfield") && cats.equals("Felix")){
                cartoonCats = true;
                break;
            }

        }
        System.out.println(cartoonCats);

        /*
        Task-7
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75

        THEN:
        -Print the entire array
        -Print each element

        Expected Result:
        [10.5, 20.75, 70, 80, 15.75]
        10.5
        20.75
        70
        80
        15.75
                 */

        System.out.println("\n----Task-7----\n");

        double[] number3 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(number3));

        System.out.println(number3[0]);
        System.out.println(number3[1]);
        System.out.println(number3[2]);
        System.out.println(number3[3]);
        System.out.println(number3[4]);

        /*
        Task-8
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4

        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters

        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3
         */

        System.out.println("\n----Task-8----\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));

        int letter = 0;
        int lowercaseLetters = 0;
        int uppercaseLetters = 0;
        int digits = 0;
        int special = 0;

        for(int i = 0; i <= characters.length - 1; i++) {
            if (Character.isLetter(characters[i])) letter++;
            if (Character.isUpperCase(characters[i]))
                uppercaseLetters++;
            if(Character.isLowerCase(characters[i]))
                lowercaseLetters++;
           if(Character.isDigit(characters[i]))
                digits++;
           else if (!Character.isLetter(characters[i]) && !Character.isLowerCase(characters[i])
           && !Character.isUpperCase(characters[i]) && !Character.isDigit(characters[i]))
               special++;
        }


        System.out.println("Letter = " + letter);
        System.out.println("Uppercase letters = " + uppercaseLetters);
        System.out.println("Lowercase letters = " + lowercaseLetters);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);

        /*
        Task-9
        Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler

        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring cases

        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        Elements having ”book” or “pen”= 4
                 */

        System.out.println("\n----Task-9----\n");
        String[] object = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(object));

        int countUpper = 0;
        int countLower = 0;
        int countBp = 0;
        int countWord = 0;


        for(int i = 0; i < object.length; i++){
            if(object[i].charAt(0) >= 65 && object[i].charAt(0) <= 90) countUpper++;
            if(object[i].charAt(0) >= 97 && object[i].charAt(0) <= 122) countLower++;
            if(object[i].charAt(0) == 'B' || object[i].charAt(0) == 'P' || object[i].charAt(0) == 'b' || object[i].charAt(0) == 'p') countBp++;
            if(object[i].toLowerCase().contains("book") || object[i].toLowerCase().contains("pen")) countWord++;
        }

        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starting with B or P = " +countBp);
        System.out.println("Elements having \"book\" or \"pen\" = " + countWord);

        /*
        Task-10
        -Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78

        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10

        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that are more than 10 = 5
        Elements that are less than 10 = 4
        Elements that are 10 = 2

         */

        System.out.println("\n----Task-10----\n");
        int[] numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers));

        int countMoreThan10 = 0;
        int countLessThan10 = 0;
        int elements10 = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 10) countMoreThan10++;
            if(numbers[i] < 10) countLessThan10++;
            if(numbers[i] == 10) elements10++;
        }
        System.out.println("Elements that are more than 10 = " + countMoreThan10);
        System.out.println("Elements that are less than 10 = " + countLessThan10);
        System.out.println("Elements that are 10 = " + elements10);

        /*
        Task-11
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0

        THEN:
        -Print both arrays
        –Then, create a new array called that will take greatest of same index from first 2 arrays
        -Print third array as well

        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */

        System.out.println("\n----Task-11----\n");

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        System.out.println("1 st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));

        int[] third = new int [5];

        for(int i = 0; i < third.length; i++){
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(third));



    }
}
