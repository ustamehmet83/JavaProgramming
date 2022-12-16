package day39_EncapsulationAndInheritancePractice.animal;

public class WildAnimal extends Animal {

    public boolean isWild,isFriendly,isPlayable;

    public WildAnimal(String name, String breed, String color, char gender, int age, String size,boolean isWild,boolean isFriendly,boolean isPlayable) {
        super(name, breed, color, gender, age, size);
        this.isWild=isWild;
        this.isFriendly=isFriendly;
        this.isPlayable=isPlayable;
    }
    public void hunt(){
        System.out.println(getName()+ " is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
