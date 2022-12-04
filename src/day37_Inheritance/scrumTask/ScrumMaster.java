package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, String companyName, int id, int salary, int age, char gender) {
        super(name, "Scrum Master", companyName, id, salary, age, gender);
    }
}
