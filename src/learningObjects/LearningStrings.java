package learningObjects;

public class LearningStrings {
    public static void main(String[] args) {

        // only declare
        //assign

        //create a String variable and assign "Hello"

        String word = "Hello";
        //word = "Hi";
String  name = "Sheker", age="32" , height, address;

name = "Ilkin";
age="32";
height="5.5";
address="1847 VISTA";

        System.out.println(name + "\n"  + age + "   " + height + "  " + address );

        //declare and assign

        //create a String variable and assign "Hello"

        System.out.println(word.concat(" " + name));

        String tv, shoeSize, dressSize, color;
        tv = "6.3 inches";
        shoeSize = "7 1/2";
        dressSize = "M";
        color = "white";

        System.out.println("MY tv size is" + tv + "\n" + shoeSize + "\n" +   dressSize + "\n" + color);

        System.out.println("Hello" + " " + "Hello");
        System.out.println(word + " " + tv);

        String state, nationality, city, language;

        state = "Illinois";
        nationality = "Asian";
        city = "Lindenhurst";
        language = "Russian";

        System.out.println("  " + state + "\n" + nationality + "\n" + "\t" + city + "\n" + language);



    }
}
