package collections.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

        /*
        Create a list to store below data
        cities

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
         */

        String[] countries = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};


        List<String> str = new LinkedList<>(Arrays.asList(countries));
        System.out.println(str);

        str.removeIf(element -> element.equals("Dallas")); // removes all Dallas in String array
        str.remove("Miami"); // removes one Miami
        System.out.println(str);



    }
}
