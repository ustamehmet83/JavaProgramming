package day39_EncapsulationAndInheritancePractice.animal;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }
}
