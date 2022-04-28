package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.TreeSet;

public class WriteData {
    public static void main(String[] args) {

        File myFile = new File("studentList.txt");
        try{
            System.out.println(myFile.createNewFile());
            Thread.sleep(5000);
            System.out.println("hello".charAt(15));

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
           // myFile.delete();

        }
        System.out.println("End of the program!");


        File file = new File("studentList.txt");
        try{
            file.createNewFile();
            Thread.sleep(5000);

            // Write some info to file
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter. write("Sheker\n");
            fileWriter. write("Ilkin\n");
            fileWriter. write("Erkin\n");
            fileWriter.close(); // save

            Thread.sleep(5000);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
             file.delete();

        }
        System.out.println("End of the program!");
    }
}
