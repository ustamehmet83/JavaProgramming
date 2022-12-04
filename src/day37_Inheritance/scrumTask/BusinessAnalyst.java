package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String companyName, int id, int salary, int age, char gender) {
        super(name, "Business Analyst", companyName, id, salary, age, gender);
    }

    public void analyze(){
        System.out.println(name+" is analyzing documents");
    }







}
