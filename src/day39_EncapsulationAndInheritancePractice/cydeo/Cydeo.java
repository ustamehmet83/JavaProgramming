package day39_EncapsulationAndInheritancePractice.cydeo;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer1=new Developer("Ahmet",40,'f',145,"Developer",125000);
        Tester tester1= new Tester("Mehmet",40,'F',146,"Sdet",120000);
        Teacher teacher1=new Teacher("Daniel",32,'M',3,"Math Teacher",100000);
        Student student1= new Student("Ahmet",20,'M',34,"Sdet");
        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);


        developer1.setName("Mehmet");


        developer1.work();
        tester1.work();






    }
}
