package day37_Inheritance.scrumTask;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, String companyName, int id, int salary, int age, char gender) {
        super(name, jobTitle, companyName, id, salary, age, gender);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+ name+" is fixing bugs");
    }







}
