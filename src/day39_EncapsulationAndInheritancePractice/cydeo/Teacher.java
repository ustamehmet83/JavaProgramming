package day39_EncapsulationAndInheritancePractice.cydeo;

import day39_EncapsulationAndInheritancePractice.cydeo.Employee;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        super.work();
    }


}
