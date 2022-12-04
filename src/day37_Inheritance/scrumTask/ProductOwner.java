package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String companyName, int id, int salary, int age, char gender) {
        super(name, "Product Owner", companyName, id, salary, age, gender);
    }

    public void gatherRequirement(){
        System.out.println(jobTitle+" "+name+ " is gathering requirement");
    }




}
