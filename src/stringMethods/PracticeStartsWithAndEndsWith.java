package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {
        /*
        Ask user to enter a name
        If name starts with A or a then print "You are in the club A"
        If the name does not start with A or a print "You are not in the club A"
         */

        String name= ScannerHelper.getANameFromUser();


        if(name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in the club A");
        }else{
            System.out.println("You are not in the club A");
        }

//2

        if(name.toUpperCase().startsWith("A")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }
//3

        if(name.toLowerCase().startsWith("a")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

//4

        if(name.charAt(0) == 'A' || name.charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }
//5

        if(name.toUpperCase().charAt(0) == 'A'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

 //6


        if(name.toLowerCase().charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

//7

        if(name.charAt(0) == 65 || name.charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

//8
        if(name.toUpperCase().charAt(0) == 65){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

//9

        if(name.toLowerCase().charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");

    }

}

