package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args) {
        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global; //+operator
        String schoolName2 = tech.concat(global);  //concat method

        System.out.println(schoolName1 + "\n" + schoolName2);

        String myName = "Sheker";
        String myLastName = "Hakberdiyeva";
        String space = " ";
        // Pseudo code
        // create a String variable double quotations
        // create a String variable with '+'
        // create a String variable with concat()

        String fullName1 = "Sheker Hakberdiyeva";
        String fullName2= myName + " " + myLastName;
        String fullName3 = myName.concat(" " + myLastName);
        // "Sheker".concat(myLAstName);

        System.out.println("This is a fullName1 -->" + fullName1);
        System.out.println("This is a fullName2 -->" + fullName2);
        System.out.println("This is a fullName3 -->" + fullName3);

    }
}
