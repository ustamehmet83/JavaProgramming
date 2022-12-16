package day39_EncapsulationAndInheritancePractice.cydeo;

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;
    private int salary;
    public Employee(String name, int age, char gender,int employeeId,String jobTitle,int salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        if(employeeId<=0){
            System.err.println("invalid employeeId");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank()||jobTitle.isEmpty()){
            System.out.println("invalid job title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        if(salary<=0){
            System.out.println("invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "name= " +"\""+ getName() +"\""+
                ", age= " + getAge()+
                ", gender=' " + getGender()+'\''+
                ", employeeId= " + employeeId +
                ", jobTitle= \"" + jobTitle + "\"" +
                ", salary=" + salary +
                '}';
    }
}
