package day36_OOPInheritanceIntro.employee;

public class Employee {
    public String name;
    public char gender;
    public String jubTitle;
    public int id;
    public int salary;
    public String companyName;

    public void work(){
        System.out.println(name+" is working");
    }

    public void setInfo(String name, char gender, String jubTitle, int id, int salary, String companyName) {
        this.name = name;
        this.gender = gender;
        this.jubTitle = jubTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jubTitle='" + jubTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
