package day36_OOPInheritanceIntro.employee;

public class Teacher extends Employee {

    public static void main(String[] args) {

        Teacher teacher= new Teacher();
        teacher.setInfo("Michael",'M',"Teacher", 146,100000,"Cydeo");
        System.out.println(teacher);



    }



}
