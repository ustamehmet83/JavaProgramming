package day39_EncapsulationAndInheritancePractice.animal;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }
    public void fly(){
        System.out.println(getName()+" is flying");
    }
}
