package day39_EncapsulationAndInheritancePractice.cydeo;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        super.work();
    }

    public void fixingBugs(){
        System.out.println(getName()+ " is fixing bugs");
    }


}
