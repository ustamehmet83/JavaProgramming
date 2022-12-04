package day33_Statics.Task;

public class Dog {
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs=2;
    public static int numberOfWings=0;
    public static boolean isFriendly=true;


    public void eat(){
        System.out.println(breed+"is eating");
    }
    public void sleep(){
        System.out.println(breed+"is sleeping");
    }
    public void play(){
        System.out.println(breed+"is playing");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
