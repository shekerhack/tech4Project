package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate); //Sat Apr 30 10:14:37 CDT 2022  my birthday is 10/12/1992

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); // Always capital MM because lower mm means different reserved for minutes
        System.out.println("Today is = " + sdf.format(currentDate)); //4/30/2022

        // Print the date in the format of Sat hh : mm PM

        sdf = new SimpleDateFormat("EEE hh:mm a");

        System.out.println(sdf.format(currentDate)); // Sat 10:28 AM

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday

        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022

        System.out.println(new SimpleDateFormat("hh 'o' 'clock' a, zzzz").format(currentDate)); // 10 o clock AM, Central Daylight Time




    }
}
