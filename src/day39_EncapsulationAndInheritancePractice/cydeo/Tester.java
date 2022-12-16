package day39_EncapsulationAndInheritancePractice.cydeo;

import day39_EncapsulationAndInheritancePractice.cydeo.Employee;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    @Override
    public void work() {
        super.work();
    }

    public void createTicket() {
        System.out.println(getName() + " is creating ticket");
    }



}
