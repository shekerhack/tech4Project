package enums;

import java.lang.management.MonitorInfo;
import java.time.Month;

public class TraversingEnums {
    public static void main(String[] args) {

        for(Day day : Day.values()){
            System.out.println(day);
        }

        // Traverse Months

        for(Month month : Month.values()){
            System.out.println(month);
        }
    }
}
