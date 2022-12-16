package day39_EncapsulationAndInheritancePractice.animal;

public class Animal {
    private String name,breed,color;
    private char gender;
    private int age;
    private String size;

    public Animal(String name, String breed, String color, char gender, int age, String size) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setAge(age);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if (name.isBlank()||name.isEmpty()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if (breed.isBlank()||breed.isEmpty()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setColor(String color) {
        if (color==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if (color.isBlank()||color.isEmpty()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.color = color;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            System.out.println("invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public void setSize(String size) {
        if (!(size.equals("S")||size.equals("M")||size.equals("L"))){
            System.out.println("invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
