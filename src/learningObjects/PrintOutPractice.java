package learningObjects;

public class PrintOutPractice {
    public static void main(String[] args) {
        char cH = 'H';
        char e = 'e';
        char l = 'l';
        char o= 'o';

        System.out.print(cH);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);

        String greetings = "Hello";

        System.out.print("\n" + greetings);

        System.out.println("\n" + cH + e + l + l + o);

        System.out.println("\n\n\n\n");

        String studentName = "Sheker";
        String studentName2 = "Ilkin";
        String studentName3 = "Andrie";

        System.out.println((studentName + " is sleeping. " + "\n" + studentName2 + " is coding. " + "\n" + studentName3 + " is eating."));

        int count = 10;
        System.out.println(studentName + " is sleeping almost " + count + " hours.");

        double currency = 12.3654;

        float abc = 15.63F;

        char character  = 'T';

        char comma = ',';

        System.out.println(currency + "," + abc + "," + character);

        System.out.println(currency + comma + abc + comma + character);

        int myChar = 'S';

        System.out.println("myChar -->" + myChar);

        int capitalNumber = 72;
        int myCharacter = '*';

        System.out.println(capitalNumber);
        System.out.println(myCharacter);

        boolean myWord = true; boolean myLie = false;

        System.out.println(myWord  + "\n" + "\t" +  myLie);

        String myBirthPlace, myRelation, myFavoriteBag,myDreamJob;

        myBirthPlace = "Turkmenistan";
        myRelation = "married";
        myFavoriteBag = "Chanel";
        myDreamJob = "doing nothing";

        System.out.println(" I was born in " + " " + myBirthPlace + " and I got " + myRelation.concat(" with a man from \" Azerbaycan. \"" + "\n" + " I love " +
                myFavoriteBag + " bag." + " \t " + "\n" + " I want to spent my entire year with " + myDreamJob + "."));









    }
}
