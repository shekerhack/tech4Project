package oop_principles.class_objects;

public class Student {

    // Please call default construction here
    public Student(){

    }
    // Define public instance variable of Student class as below
    // FirstName, lastName, age, dateOfBirth, gender, address
    // height, weight, email, id

    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String gender;
    public String address;
    public double height;
    public double weight;
    public String email;
    public int id;

    //Define Student behaviors - functions
    // study, eat, sleep

    public void study(){
        System.out.println("Student studies");
    }

    public void eat(){
        System.out.println("Student eats");
    }

    public void sleep(){
        System.out.println("Student sleeps");
    }

    // Override toString() method from Object class


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';

}
}
