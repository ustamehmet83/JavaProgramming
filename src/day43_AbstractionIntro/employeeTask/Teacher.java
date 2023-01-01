package day43_AbstractionIntro.employeeTask;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 8 hours");

    }
    public void teach(){
        System.out.println(getName()+" is teaching");
    }
}
