package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  {
        // TO create a file we use some classes

        File myFile = new File("myFirstFile.xls");

        try {
            System.out.println(myFile.createNewFile()); // true
            Thread.sleep(5000);
            System.out.println(myFile.delete()); // true
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("End of the program!");


        File myFile1 = new File("myFirstFile.xls");

        try {
            System.out.println("Checking if exists before creating file = " + myFile1.exists()); // false
            System.out.println(myFile.createNewFile()); // true
            System.out.println("checking if exists after creating file = " + myFile1.exists()); // true
            System.out.println("File name is = " + myFile1.getName());
            System.out.println("Absolute path of the file = " + myFile1.getAbsolutePath());
            System.out.println("Can file write = " + myFile1.canWrite());
            System.out.println("Can file read = " + myFile1.canRead());
            System.out.println("Size of the file = " + myFile1.length() );

            Thread.sleep(10000);

            System.out.println(myFile.delete()); // true
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("End of the program!");
    }
}
