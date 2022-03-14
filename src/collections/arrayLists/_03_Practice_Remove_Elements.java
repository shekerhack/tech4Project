package collections.arrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

    public class _03_Practice_Remove_Elements {
        public static void main(String[] args) {
            List<String> languages = new LinkedList<>();

            languages.add("Java");
            languages.add("JavaScript");
            languages.add("C#");
            languages.add("Python");
            languages.add("C++");

            //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */

            System.out.println("\n------Task-1-----\n");
            languages.remove("Python");
            System.out.println(languages);

            /*
            TASK-2
            Remove all elements that start with J

            RESULT:
            [C#, C++]
             */


            System.out.println("\n------Task-2-----\n");

            List<String> removeJ = new LinkedList<>();

            for(String element : languages){
                if(element.startsWith("J")) removeJ.add(element);
            }
            languages.removeAll(removeJ);
            System.out.println(languages);

            // Other way
            languages.removeIf(element->element.startsWith("j"));
            System.out.println(languages);



        }
    }
