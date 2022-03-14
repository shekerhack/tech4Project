package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StudentTest {
    public static void main(String[] args) {

        /*
        Create a Student object with below information
        firstName = John;
        lasName = Doe;
        age = 45;
        dateOfBirth = 01/01/1977;
        gender = male;
        address = Chicago;
        weight = 170.5;
        height = 5.7;
        email = johndoes@gmail.com;
        id = 1001
         */

        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "Male";
        student1.address = "Chicago";
       student1.weight = 170.5;
        student1.height = 5.7;
       student1.email = "johndoes@gmail.com";
       student1.id = 1001;
        System.out.println(student1);

        /*
        Create another Student object with below information
        firstName = Lionel
        lastName = Messi
        age = 34;
        dateOfBirth = 01/01/1988
        gender = male
        address = Paris
        weight = 150
        height = 4.9
        email = lionel@gmail.com
        id = 1002

        Then, print the object
        Student{firstName='Lionel', lastName='Messi', age=34, dateOfBirth='01/01/1988', gender='male', address='Paris', weight=150.0, height=4.9, email='lionel@gmail.com', id=1002}
         */

        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "Male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;
        System.out.println(student2);

        /*
        Create 3 more Student object with below information
        firstName = Alex, Jessie, Kaly
        lastName = Morgan, Smith, Ngo
        age = 20, 15, 16;
        dateOfBirth = 01/01/2002 - 01/01/2007 - 01/01/2006
        gender = male, female, female
        address = Chicago, Miami, Berlin
        weight = 165, 160, 150
        height = 5.5, 5.7, 5.3
        email = alex@gmail.com, jessie@gmail.com, kaly@gmail.com
        id = 1003, 1004, 1005

        Then, print the objects
         */

        Student student3 = new Student();
        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2002";
        student3.gender = "Male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();
        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "Female";
        student4.address = "Miami";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();
        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender = "Female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5.height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;
        System.out.println(student5);

         /*
        TASK-1
        Count how many students are from Chicago

        EXPECTED:
        2
         */
        System.out.println("\n-------TASK-1----------\n");

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add((student5));

        int count = 0;
        int male = 0;
        int female = 0;

        for(Student find : allStudents) {
            if (find.address.equalsIgnoreCase("Chicago")) count++;
            if(find.gender.toLowerCase().startsWith("m")) male++;

        }
        System.out.println(count);

        System.out.println("\n-------TASK-2---Other way-------\n");
        System.out.println("males = " + male);
        System.out.println("female = " + (allStudents.size() - male));

        /*
        TASK-2
        Count how many students are male and female
         */

        System.out.println("\n-------TASK-2----------\n");

        int countFemale = 0;
        int countMale = 0 ;


        for(Student gender : allStudents){
            if(gender.gender.equalsIgnoreCase("Male")) countMale++;
            if(gender.gender.equalsIgnoreCase("Female")) countFemale++;
        }

        System.out.println("Female = " + countFemale);
        System.out.println("Male = " + countMale);

        /*
        TASK-3
        Count how many student are teenager
        EXPECTED:
        2
         */

        System.out.println("\n-------TASK-3----------\n");

        int countTeen = 0;

        for(Student teen : allStudents){
            if(teen.age > 12 && teen.age < 20) countTeen++;
        }
        System.out.println(countTeen);

        /*
        TASK-4
        Print all information oF each student in separate lines
         */

        System.out.println("\n-------TASK-4----------\n");
        for(Student students : allStudents){
            System.out.println(students.firstName);
            System.out.println(students.lastName);
            System.out.println(students.age);
            System.out.println(students.dateOfBirth);
            System.out.println(students.gender);
            System.out.println(students.address);
            System.out.println(students.height);
            System.out.println(students.weight);
            System.out.println(students.email);
            System.out.println(students.id);
            System.out.println();

        }

        System.out.println("\n-------TASK-4----Other Way------\n");
        allStudents.forEach(students -> {
            System.out.println(students.firstName);
            System.out.println(students.lastName);
            System.out.println(students.age);
            System.out.println(students.dateOfBirth);
            System.out.println(students.gender);
            System.out.println(students.address);
            System.out.println(students.height);
            System.out.println(students.weight);
            System.out.println(students.email);
            System.out.println(students.id);
            System.out.println();

        });

    }
}
