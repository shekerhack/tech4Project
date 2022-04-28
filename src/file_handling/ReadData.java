package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        /*
    1. create a new txt file called shoppingList
    2. Write all items below
    Ice-cream
    Fruits
    Pen
    Paper
    Milk
     */

        File file = new File("shoppingList");

        try {
            file.createNewFile();
            FileWriter writeShoppingList = new FileWriter("shoppingList");
            writeShoppingList.write("Ice-cream\n");
            writeShoppingList.write("Fruits\n");
            writeShoppingList.write("Pen\n");
            writeShoppingList.write("Paper\n");
            writeShoppingList.write("Milk");
            writeShoppingList.close();
            Thread.sleep(5000);

            // How to read information from a file

            Scanner scanner = new Scanner(file);

           /* for(int i = 1; scanner.hasNextLine(); i++){
                Thread.sleep(1000);
                System.out.println("Item " + i + " = " + scanner.nextLine());
            }*/
            int index = 1;
            while(scanner.hasNextLine()){
                System.out.println("Item " + index++ + " = " +  scanner.nextLine());
            }

        }catch(Exception e){
            e.printStackTrace();
        } 
        finally {
            file.delete();
        }
        System.out.println("End of the program!");

    }
}
