package day43_AbstractionIntro.employeeTask;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleep 10 hours");

    }
    public void drive(){
        System.out.println(getName()+" is driving");
    }
}
