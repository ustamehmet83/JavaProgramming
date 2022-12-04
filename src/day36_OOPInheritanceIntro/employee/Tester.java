package day36_OOPInheritanceIntro.employee;

public class Tester extends Employee {


    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


    public static void main(String[] args) {

        Tester tester= new Tester();
        tester.setInfo("Michael",'M',"Tester",146,100000,"MIT");
        tester.creatingTicket();


    }
}
