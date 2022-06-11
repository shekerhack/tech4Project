package mocks;

import java.util.HashMap;
import java.util.Map;

public class Mock4 {
     /*
    Requirement:
    -Student is responsible to create a main method and test their method.
    -Write a method that takes an array of String and returns the count of each unique element in the array as a Map
    Test Data:
    ["Apple", "Apple", "Orange", "Apple", "Kiwi"]
    Expected:
     {Apple=3, Orange=1, Kiwi=1}
     Mock 4
     */

    public static Map<String, Integer> uniqueElement(String[] arr) {
        HashMap<String, Integer> unique = new HashMap<>();
        for (String a : arr) {
            if (!unique.containsKey(a)) {
                unique.put(a, 1);
            } else {
                unique.put(a, unique.get(a) + 1);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueElement(new String[] {"Apple", "Apple", "Orange", "Apple", "Kiwi"}));
    }
}
