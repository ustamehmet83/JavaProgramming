package day46_Polymorphism;

import day38_Inheritance.Shape.Rectangle;
import day43_AbstractionIntro.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str="Wooden Spoon";

        Integer n1=2;

        Double b2=5.5;

        Boolean r1= true;

        Object [] array={str,n1,b2,r1,new Circle(4),new Square(7)};

        /*

        WebDriver driver;

        driver= new ChromeDriver();

        driver= new FirefoxDriver();

         */

        Employee tester= new Tester("Ali",30,'M',42,"SDET",145000);
        Employee developer= new Developer("Alex",28,'M',32,"Web Developer",155000);
        Employee teacher= new Teacher("Angel",28,'F',22,"English Teacher",80000);
        Employee driver = new Driver("John",34,'M',42,"Lyft Driver",75000);

        //ArrayList<Tester> cydeoEmployees=new ArrayList<>();
        ArrayList<Employee> cydeoEmployees=new ArrayList<>();
        ArrayList<Person> cydeoEmployees2=new ArrayList<>();

        Employee cydeoTeacher=new Teacher("Angel",28,'F',22,"English Teacher",80000);


        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("-------------------------------");

        Employee employee=new Tester("Ali",30,'M',42,"SDET",145000);
        Employee employee2=new Developer("Alex",28,'M',32,"Web Developer",155000);

        employee.work();
        employee2.work();
        //employee.bugReport(); Reference type always decide what you call method what you can access

        Animal animal=new Dog("Max","Husky",'M',3,"Small","White");
        animal.eat();
        animal.drink();
        //animal.play();
        //animal.bark();

        Playable animal2=new Dog("Max","Husky",'M',3,"Small","White");
        System.out.println(animal2.isFriendly);
        animal2.play();
//        animal2.drink();
//        animal2.eat();

        Shape shape= new Circle(5);
        shape.area();//r*r*pi

//        System.out.println(shape.getRadius());
//        System.out.println(shape.getPI());

        boolean isSquare=shape instanceof Square;
        boolean isCube=shape instanceof Cube;
        boolean isCylinder= shape instanceof Cylinder;

        /*
        WebDriver driver :
        if(driver instanceof Chrome){
            Chrome browser will open
        }else if(driver instanceof Firefox){
        Firefox browser will open}





         */





        /*
        WebDriver driver1= new ChromeDriver();
        WebDriver driver2= new ChromeDriver();
        driver1.get(amazon)
        driver2.2get(google)

        Animal animal= new Dog();
        animal.drink();

        Animal animal= new Cat();//animal drinks water
        animal.drink();//Cat is drinking milk

        Animal animal= new Tiger();//animal drinks water
        animal.drink();//Tiger is drinking beer




         */








    }
}
