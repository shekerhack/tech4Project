package operators.shortHandAssignmentOperators;

public class ShortHandAssignmentOfVariables {

    public static void main(String[] args) {

        //Example

        int age = 5;
        age = age +3;

        System.out.println(age);

///

        int old = 5;
        System.out.println(old);

        old = old +3; // reassign

        System.out.println(age);

        //
        int length = 5;
        System.out.println(length);

        length += 3;  // length = length +3; lengthAge -> 5 + 3

        System.out.println(length);

        length -=2; //--> 6
        System.out.println(length);

        length *=2; // -->12
        System.out.println(length);

        length /=3; // -->4
        System.out.println(length);



    }
}
