package day47_Polymorphism;

import day43_AbstractionIntro.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.browserTask.ChromeDriver;
import day45_Abstraction.browserTask.Webdriver;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;


public class ReferenceTypeCastings {

    public static void main(String[] args) {


        Shape shape=(Shape) new Circle(4);//upcasting: it is done implicitly

        Shape shape2= new Circle(5);

        //Webdriver driver= new ChromeDriver("chrome");

        Animal animal=new Dog("Max","Husky",'M',3,"Small","White");

        Dog dog= (Dog) animal; // downcasting
        dog.bark();

        ((Dog) animal).bark();

        System.out.println(animal.getName());

        System.out.println(dog.getName());

        Shape shape1=new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("---------------------------------------------------");

        Animal animal2=new Cat("Jim","Scotish",'M',3,"Small","White");

        //Cat cat= (Cat) animal2;
        //cat.meow();
        ((Cat) animal2).meow();
        //((Dog)animal2).bark();//ClassCastException

        System.out.println("--------------------------------------");

        Employee employee= new Tester("Ali",30,'M',42,"SDET",145000);

        ((Tester)employee).bugReport();
        //((Tester)employee).unitTest();
        //((Developer)employee).unitTest();

        //Driver driver=(Driver) employee;
        Person person=(Person)employee;
        //Teacher teacher=(Teacher)employee;

        ((Tester)person).bugReport();//Ali is creating bug reports

        System.out.println("----------------------------------------------");

        Shape s1=new Circle(10);
        s1.area();
        s1.perimeter();
        //((Cube)s1).volume();//ClassCastException










    }
}
