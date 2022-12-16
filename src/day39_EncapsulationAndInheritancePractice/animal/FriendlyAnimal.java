package day39_EncapsulationAndInheritancePractice.animal;

public class FriendlyAnimal extends Animal {

    public boolean isWild, isFriendly, isPlayable;
    public FriendlyAnimal(String name, String breed, String color, char gender, int age, String size,boolean isWild,boolean isFriendly,boolean isPlayable) {
        super(name, breed, color, gender, age, size);
      this.isWild=isWild;
      this.isFriendly=isFriendly;
      this.isPlayable=isPlayable;
    }
    public void play(){
        System.out.println(getName()+" is playing");
    }
    public void pet(){
        System.out.println(getName()+" is pet");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}

