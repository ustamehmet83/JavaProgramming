package day39_EncapsulationAndInheritancePractice.animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }
    public void scratch(){
        System.out.println(getName()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+ " is meowing");
    }
}
