package day39_EncapsulationAndInheritancePractice.animal;

public class Zoo {
    public static void main(String[] args) {
        Dolphin dolphin= new Dolphin("yunus","aa","white",'F',23,"M",true,true,true);
        Parrot parrot=new Parrot("aa","bb","cc",'M',23,"M",true,true,true);
        System.out.println(dolphin);
        System.out.println(parrot);
        parrot.eat();
        parrot.fly();
        parrot.sing();
        dolphin.eat();
    }
}
