package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */
        System.out.println("\n----TASK-1----\n");
        String[] names = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Sorted array = " + Arrays.toString(names));

        /*
        TASK-2
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom
         */
        System.out.println("\n----TASK-2----\n");
        // String[] names = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("First name is = " + names[0]);
        System.out.println("Last name is = " + names[0] + names[names.length - 1]);

        /*
        TASK-3
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names starts with A

        EXPECTED:
        2
         */

        System.out.println("\n----TASK-3----\n");
        //String[] names = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("\n----TASK-3-for each loop----\n");
        int count = 0;

        for (String student : names) {
            if (student.charAt(0) == 'A') count++;
        }
        System.out.println(count);

        int count1 = 0;

        System.out.println("\n----TASK-3--fori loop----\n");
        for (int i = 0; i < names.length; i++) {
            //if(names[i].startsWith("A") count1++;
            if (names[i].charAt(0) == 'A') count1++;
        }
        System.out.println(count1);

        /* Task-4
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        count how many names contains A-a or e-E

        Expected:
        5
         */

        //String[] names = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("\n----Task-4--fori loop----\n");
        int count2 = 0;

        for (int i = 0; i < names.length; i++) {
            if(names[i].toLowerCase().contains("a") || names[i].toLowerCase().contains("e")) count2++;
        }
        System.out.println(count2);

        System.out.println("\n----Task-4 for each loop--\n");
        int count3 = 0;

        for (String students : names) {
            students = students.toLowerCase();
            if (students.contains("a") || students.contains("e")) count3++;

        }
           System.out.println(count3);

        /*
        TASK-5
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
         */

        System.out.println("\n----Task-5----\n");

        int count4 = 0;

        for(String counter : names){
            if(counter.length() >= 5) count4++;
        }
        System.out.println(count4);

        /*
        TASK-6
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
         */

        System.out.println("\n----Task-6----\n");
        boolean hasJennifer = false;
        for(String name1 : names){
            if(name1.equals("Jennifer")){
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer);
    }
}
