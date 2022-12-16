package day39_EncapsulationAndInheritancePractice.animal;

public class Dog extends FriendlyAnimal {
    public Dog(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
