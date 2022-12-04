package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
    /*
       String str=null;
       int n= Integer.parseInt(null);
        System.out.println(str.toUpperCase());
 */

        String str="Wooden Spoon";// after line 13,"Wooden Spoon" will be eligible for garbage collection
        System.out.println(str);
        str=null;
        System.out.println(str);

        Car car1= new Car("Toyota");
        System.out.println(car1);
        car1=null;
        System.out.println(car1);

        System.out.println("----------------------------");
        Dog dog1=new Dog();
        dog1.name="Lucy";

        dog1=new Dog();
        dog1.name="Max";

        System.out.println(dog1);

        String language="Python";
        language= "Java";

        System.out.println(language);

        System.out.println("-------------------");

        ArrayList<Integer>list1=new ArrayList<>();

        list1.add(100);

        ArrayList<Integer>list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);


        System.out.println("-------------------");

        int [] list11={1,2,3,4,5};
        int [] list12=list11;
        list11[4]=6;
        System.out.println(Arrays.toString(list12));

        System.out.println("----------------------");

        Student student1= new Student("Tahir",30,'M','B',14);
        Student student2=student1;

        student1.name="Mehmet";

        System.out.println(student2.name);
        System.out.println(student1.name);

        System.out.println("-----------------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String>l2=new ArrayList<>();


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        l2=l1;

        l1.add("Python");

        System.out.println(l2);


        System.out.println("------------------");

        Circle c1=new Circle(5);

        Circle c2= new Circle(9);

        c1=c2;//9

        c1.radius=15;

        System.out.println(c2);//15


        System.out.println("---------------");
        String str3="Java";
        String str4="Python";

        str3=str4;

        System.out.println(str3);

        str3="C++";

        System.out.println(str4);//Python
        System.out.println(str3);//C++












    }
}
