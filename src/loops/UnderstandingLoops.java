package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str + "\n" + str + "\n" + str + "\n" + str + "\n" + str +
                "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str +
                "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str + "\n" + str);

        for(int count = 10; count <= 1; count--) { // post-decrement  if it is count <=1 count++ (would be infinite number doesn't have a stop point)
            System.out.println("Hello Word!");
        }
        System.out.println("End of the program!");

        // another way

        for(int count = 10; count <= 5; count++) { //
            System.out.println("Hello Word!");
        }
        System.out.println("End of the program!");

        // age becomes 35 if(age == 35)

        for(int age = 10; age <= 35; age++){
            System.out.println("The age is = " + age);
        }
        System.out.println("End of the program!");

        int year = 2022;
        for(int age = 10; age <= 35; age++){
            System.out.println("The age is = " + age + "in " + year);
            year++;
        }
        System.out.println("End of the program!");


    }
}
