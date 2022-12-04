package day37_Inheritance.scrumTask;

public class Employee extends Person{
    public String jobTitle,companyName;
    public int id;
    public int salary;


    public Employee(String name,String jobTitle,String companyName,int id,int salary, int age, char gender) {
        super(name, age, gender);
        this.jobTitle=jobTitle;
        this.companyName=companyName;
        this.id=id;
        this.salary=salary;
    }
    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
