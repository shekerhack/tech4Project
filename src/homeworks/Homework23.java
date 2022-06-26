package homeworks;

import java.util.*;
import java.util.concurrent.TransferQueue;

public class Homework23 {

    /*
    TASK-1
    Write a method called as parseData() which takes a String has some keys in {} and values after between }{ and returns a collection that has all the keys and values as entries.
    NOTE: The keys should be sorted!

    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London

    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}
     */

    public static Map<Integer, String> parseData(String str) {
        String[] s = str.replaceAll("[{}]", " ").trim().split(" ");
        TreeMap<Integer, String> unique = new TreeMap<>();
        for (int i = 0; i < s.length; i++) {
            unique.put(Integer.parseInt(s[i]), s[i + 1]);
            i++;
        }
        return unique;
    }

    /*
    TASK-2
    Write a method called as calculateTotalPrice1() which takes a Map of some shopping items with their amounts and calculates the total prices as double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25

    Test Data 1:
    {Apple=3, Mango = 1}

    Expected Output 1:
    10.99

    Test Data 2:
    {Apple=2, Pineapple = 1, Orange=3}

    Expected Output 2:
    19.12
*/

    public static double calculateTotalPrice1(Map<String, Integer> fruitList) {
        Map<String, Double> fruitsPrices = new HashMap<>();
        fruitsPrices.put("Apple", 2.00);
        fruitsPrices.put("Orange", 3.29);
        fruitsPrices.put("Mango", 4.99);
        fruitsPrices.put("Pineapple", 5.25);

        double finalResult = 0.00;

        for (String str : fruitList.keySet()) {
            finalResult += fruitList.get(str) * fruitsPrices.get(str);
        }
        return finalResult;
    }

    /*
    TASK-3
    Write a method calculateTotalPrice2() which takes a Map of some shopping items with their amounts and calculates the total prices as double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free.
    Test Data 1:
    {Apple=3, Mango = 5}
    Expected Output 1:
    24.96
    Test Data 2:
    {Apple=4, Mango = 8, Orange=3}
    Expected Output 2:
    45.81
     */
    public static double calculateTotalPrice2(Map<String, Integer> shoppingItems) {
        Map<String, Double> mapPrices = new HashMap<>();
        mapPrices.put("Apple", 2.00);
        mapPrices.put("Orange", 3.29);
        mapPrices.put("Mango", 4.99);

        double result = 0.00;

        for (String key : shoppingItems.keySet()) {
            for (int j = 1; j < shoppingItems.get(key) + 1; j++) {
                if (key.equals("Apple") && j % 2 == 0) result += mapPrices.get(key) / 2.0;
                else if (key.equals("Mango") && j % 4 == 0);
                else result += mapPrices.get(key);
            }
        }
        return Math.round(result * 100.0) / 100.0;
    }



    public static void main(String[] args) {
        System.out.println("\n----TASK-1---\n" + parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        Map<String, Integer> list = new HashMap<>();
        list.put("Apple", 3);
        list.put("Mango", 1);
        Map<String, Integer> list2 = new HashMap<>();
        list2.put("Apple", 2);
        list2.put("Pineapple", 1);
        list2.put("Orange", 3);
        System.out.println("\n----TASK-2---\n" + calculateTotalPrice1(list) + "\n" + calculateTotalPrice1(list2));

        Map<String, Integer> lists = new HashMap<>();
        lists.put("Apple", 3);
        lists.put("Mango", 5);
        Map<String, Integer> lists2 = new HashMap<>();
        lists2.put("Apple", 4);
        lists2.put("Mango", 8);
        lists2.put("Orange", 3);
        System.out.println("\n----TASK-3---\n" + calculateTotalPrice2(lists) + "\n" + calculateTotalPrice2(lists2));

    }
}


