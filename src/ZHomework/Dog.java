package ZHomework;

public class Dog extends Animal { // Subclass (child)
    public Dog(){

        System.out.println("dog sound hav hav like this");

        System.out.println("dog sound hav hav like this");
    }
    public void animalSound() {
        System.out.println("The dog says: bow wow"+super.type);
    }
}

class Cat extends Animal {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

