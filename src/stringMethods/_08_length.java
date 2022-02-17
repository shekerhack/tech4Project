package stringMethods;

public class _08_length {
    public static void main(String[] args) {
        /* Method Task: Count the total number of the character in a String and returns it as an int
        -It is a non-static method and can be called with object name
        -It is a return method, and it returns an int (total number of characters)
        -It does not take any arguments

        NOTE: It is like human thinking (1,2,3 ...)
         */
        String city = "Chicago";

        System.out.println(city.length());
        System.out.println(city.length() + 3); // 10

        String company = "TechGlobal";

        int size = company.length(); // 10
        System.out.println(size);
    }
}
