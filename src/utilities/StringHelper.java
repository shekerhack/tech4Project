package utilities;

public class StringHelper {

    public static String getMiddle(String str){ // Taylor
        // if(str.length() % 2 == 0) return "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
       // return "" + str.charAt(str.length()/2);

        return (str.length() % 2 == 0) ? "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2) : "" + str.charAt(str.length()/2);
    }
}
