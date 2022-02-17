package ifElseStatements.switchStatements;

public class CharExample {
    public static void main(String[] args) {
        char character = 'B';
        switch (character){
            case 'A':
                System.out.println("It is uppercase and is the first letter in the alphabet");
                break;
            case '5':
                System.out.println("It is a digit");
                break;
            case '$':
                System.out.println("It is a dollar sign");
                break;
            default:
                System.out.println("It is no A, 5 or $");
        }
 // other way
       /*  int character = 4;
        switch (character){
            case 'A':
                System.out.println("It is uppercase and is the first letter in the alphabet");
                break;
            case 5:
                System.out.println("It is a digit");
                break;
            case '$':
                System.out.println("It is a dollar sign");
                break;
            default:
                System.out.println("It is no A, 5 or $");

        */
        }
    }

