package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");
        System.out.println(matcher.matches()); // false it doesn't match with given pattern space and String word

        Pattern pattern2 = Pattern.compile(" ");
        Matcher matcher2 = pattern2.matcher(" ");
        System.out.println(matcher2.matches()); // true

        while(matcher.find()){ // finds the next matched pattern in the given String
            System.out.println(matcher.group()); // print out the next matched pattern in the given String
            System.out.println("Start index: " + matcher.start()); // it returns integer print out where found pattern starts
            System.out.println("End index: " + matcher.end()); // it returns integer print out where found pattern ends
        }






    }
}
