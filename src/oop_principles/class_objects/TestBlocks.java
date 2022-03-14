package oop_principles.class_objects;

public class TestBlocks {

    // Static block of Fruit will be executed
    public static void main(String[] args) {
        System.out.println("This is line 1 in the main method before object being created");
        System.out.println(Fruit.hasColor);  // true
        Fruit fruit1 = new Fruit();
        System.out.println("This is last line in the main method after object being created");
    }
}
