package oop_principles.class_objects;

public class Fruit {

    // Instance variable

    public static boolean hasColor;

    static{
        System.out.println("This is static block");
        hasColor = true;
    }

    public String name;
    public String shape;
    public boolean isSweet;

    {
       // hasColor = true; // static variables can be in non-static block
        System.out.println("This is  instance block");
        shape = "Round";
        isSweet = true;
    }
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        System.out.println(Fruit.hasColor); // true
        System.out.println(fruit1.name); // null
        System.out.println(fruit1.shape); // Round
        System.out.println(fruit1.isSweet); // true

    }

}
