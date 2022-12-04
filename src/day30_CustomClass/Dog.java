package day30_CustomClass;

public class Dog {

    public String name;//instance:each object they can have separate copy
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName,String dogBreed,int dogAge,char dogGender,String dogSize,String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    //if we give static it means it has only one copy
    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
    names, age, gender,breed, size, color


Actions:
    eat(), play(), bark()....


 */
