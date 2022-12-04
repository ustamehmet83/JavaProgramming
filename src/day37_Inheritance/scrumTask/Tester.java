package day37_Inheritance.scrumTask;

public class Tester extends Employee{//Tester IS A Employee, Tester IS A Person
    public Tester(String name, String jobTitle, String companyName, int id, int salary, int age, char gender) {
        super(name, jobTitle, companyName, id, salary, age, gender);
    }
    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
}
