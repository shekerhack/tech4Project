package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args) {

        // DataType variableName = data/value; --.Creating variables
        // DataType/Classname variableName = new DataType/Classname (if it is needed)
        //creating an object

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Where is your address?");
        String userAddress = "\"" + inputReader.nextLine() + "\""; //variableName.methodeName();

        System.out.println("User address is =".concat("\"" + userAddress) + "\"");


    }
}
