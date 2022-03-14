package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        /*
        /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list

        RESULT:
        [BMW, Mercedes, Volkswagen]
         */

        ArrayList<String> germanCars = new ArrayList<>();

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        System.out.println("German cars = " + germanCars);

        /*
        TASK-2
        Create an ArrayList of japaneseCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list

        RESULT:
        Japanese cars = [Honda, Toyota, Lexus]
         */

        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add(0, "Honda");
        japaneseCars.add(1, "Toyota");
        japaneseCars.add(2,"Lexus");

        System.out.println("Japanese cars = " + japaneseCars);

        /*
        TASK-3
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print the list

        RESULT:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("Luxury cars = " + luxuryCars);




    }
}
