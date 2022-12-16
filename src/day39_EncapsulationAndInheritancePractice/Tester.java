package day39_EncapsulationAndInheritancePractice;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void work() {
        System.out.println(getName()+ " is working");
    }
    public void createTicket(){
        System.out.println(getName()+ " is fixing bugs");
    }


    public String toString() {
        return "Tester{" +
                "name=" + getName() +'\''+
                "age=" + getAge()+'\''+
                "gender=" + getGender()+'\''+
                "employeeId=" + getEmployeeId()+'\''+
                ", jobTitle='" + getJobTitle()+ '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
