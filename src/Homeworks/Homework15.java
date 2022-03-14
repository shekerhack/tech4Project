package Homeworks;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {

        /*
         Requirement:
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78

        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list

        Expected Result:
        23
        10
        67
        [10, 23, 67, 23, 78]
         */

        System.out.println("\n-----TASK-1----\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        /*
        Requirement:
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple

        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list

        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple]
         */

        System.out.println("\n-----TASK-2----\n");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        /*
        Requirement:
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100

        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order

        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */

        System.out.println("\n-----TASK-3----\n");

        ArrayList<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(-34);
        number.add(-56);
        number.add(0);
        number.add(89);
        number.add(100);
        System.out.println(number);

        Collections.sort(number);
        System.out.println(number);

        /*
        Requirement:
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris

        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically

        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]
        [Berlin, Istanbul, Madrid, Paris]
         */

        System.out.println("\n-----TASK-4----\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);

        /*
        Requirement:
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain America

        THEN:
        -Print the entire list
        -Then, check if it contains Wolwerine
            if it contains Wolwerine, then print true
            if it does not contain Wolwerine, print false

        Expected Result:
        [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
        false
         */

        System.out.println("\n-----TASK-5----\n");

        ArrayList<String> marvelCharacters = new ArrayList<>();

        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panter");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");

        System.out.println(marvelCharacters);

        System.out.println(marvelCharacters.contains("Wolwerine"));

        /*
        Requirement:
        -Create an ArrayList and store Avengers characters below
        Hulk, Black Widow, Captain America, Iron Man

        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
            if it contains both, then print true
            if it does not contain both, print false

        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
         */

        System.out.println("\n-----TASK-6----\n");

        ArrayList<String> avengersCharacter = new ArrayList<>();
        avengersCharacter.add("Hulk");
        avengersCharacter.add("Black Widow");
        avengersCharacter.add("Captain America");
        avengersCharacter.add("Iron Man");

        Collections.sort(avengersCharacter);
        System.out.println(avengersCharacter);
        System.out.println(avengersCharacter.contains("Hulk") && avengersCharacter.contains("Iron Man"));

        /*
        Requirement:
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G

        THEN:
        -Print the entire list
        -Print each element

        Expected Result:
        [A, x, $, %, 9, *, +, F, G]
        A
        x
        $
        %
        9
        *
        +
        F
        G
         */

        System.out.println("\n-----TASK-7----\n");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for(int i = 0; i < chars.size(); i++){
            System.out.println(chars.get(i));
        }

        /*
        Requirement:
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter

        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e

        Expected Result:
        [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
        [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
        3
        1
         */

        System.out.println("\n-----TASK-8----\n");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

        int countMm = 0;
        int countEe = 0;

        for(String str : objects){
            if(str.toLowerCase().startsWith("m")) countMm++;
            if(!str.toLowerCase().contains("a") && !str.toLowerCase().contains("e")) countEe++;
        }

        System.out.println(countMm);
        System.out.println(countEe);

        /*
        Requirement:
        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer

        THEN:
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p

        Expected Result:
        [Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p = 2
         */

        System.out.println("\n-----TASK-9----\n");

        ArrayList<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countHasPp = 0;
        int countStartsEndsPp = 0;

        for(String str2 : kitchenObjects){

            if(Character.isUpperCase(str2.charAt(0))) countUpperCase++;
            if(Character.isLowerCase(str2.charAt(0))) countLowerCase++;
            if(str2.toLowerCase().contains("p")) countHasPp++;
            if(str2.toLowerCase().startsWith("p") || str2.toLowerCase().endsWith("p")) countStartsEndsPp++;
        }

        System.out.println(kitchenObjects);
        System.out.println("Elements start with uppercase = " + countUpperCase);
        System.out.println("Elements start with lowercase = " + countLowerCase);
        System.out.println("Elements contain P or p = " + countHasPp);
        System.out.println("Elements start and end with P or p = " + countStartsEndsPp);

        /*
        Requirement:
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78

        THEN:
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than 15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or greater than 50

        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that can be divided by 10 = 4
        Elements that are even and greater than 15 = 3
        Elements that are odd and less than 20 = 4
        Elements that are less than 15 or greater than 50 = 8
         */

        System.out.println("\n-----TASK-10----\n");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(10);
        numbers2.add(0);
        numbers2.add(20);
        numbers2.add(17);
        numbers2.add(10);
        numbers2.add(23);
        numbers2.add(56);
        numbers2.add(78);

        int countDividedBy10 = 0;
        int countGreaterThan15 = 0;
        int countOddLessThan20 = 0;
        int countLess15GreaterThan50 = 0;

        for(Integer num : numbers2){
            if(num % 10 == 0) countDividedBy10++;
            if(num % 2 == 0 && num > 15) countGreaterThan15++;
            if(num % 2 == 1 && num < 20) countOddLessThan20++;
            if(num < 15 || num >= 50) countLess15GreaterThan50++;
        }


        System.out.println(numbers2);
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + countGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLess15GreaterThan50);

    }
}
