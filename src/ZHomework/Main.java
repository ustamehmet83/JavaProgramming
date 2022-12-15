package ZHomework;

import java.util.ArrayList;

class Animal { // Superclass (parent)
    protected String type="animal";

    public Animal(){
        System.out.println("The animal makes any sound");
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}



public class Main {
    public static void main(String args[]) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object
        Animal myDog1 = new Animal();
    }
}
class Student {
    public String name, gender, ID;

    public Student(String name, String gender, String ID) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }
}

class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        // Use the Student constructor to create and initialize each student object
        students[0] = new Student("Komiljon", "male", "123456");
        students[1] = new Student("Zorana", "female", "234567");
        students[2] = new Student("Selda", "female", "345678");

        System.out.println(students[1].name);
    }
}

 class Person2 {
    private String name;
    private int age;

    public Person2(String name) {
        this(name, 0);  // Call the other constructor with default age
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}







