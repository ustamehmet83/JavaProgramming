package day39_EncapsulationAndInheritancePractice;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getAge()+ " is working");
    }

    @Override
    public String toString() {
        return  "Teacher{" +
                "name=" + getName() +'\''+
                "age=" + getAge()+'\''+
                "gender=" + getGender()+'\''+
                "employeeId=" + getEmployeeId()+'\''+
                ", jobTitle='" + getJobTitle()+ '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
