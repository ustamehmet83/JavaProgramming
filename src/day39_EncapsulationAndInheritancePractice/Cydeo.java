package day39_EncapsulationAndInheritancePractice;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester1= new Tester("Mehmet",40,'F',146,"Sdet",120000);
        Student student1= new Student("Ahmet",20,'M',34,"Sdet");
        System.out.println(tester1);
        System.out.println(student1);
        Developer developer1=new Developer("Ahmet",40,'f',145,"Developer",125000);
        System.out.println(developer1);
        developer1.work();
        tester1.work();






    }
}
