package day35_Encapsulation.Task.ScrumTeam;

public class Developer {
    public class pDeveloper {

        private String name;
        private int employeeID;
        private String jobTitle;

        private char gender;
        private double salary;

        public pDeveloper(String name, int employeeID, String jobTitle, double salary) {
            setName(name);
            setEmployeeID(employeeID);
            setJobTitle(jobTitle);
            setGender(gender);
            setSalary(salary);

        }
        public String getName() {
            return name;
        }
        public int getEmployeeID() {
            return employeeID;
        }
        public String getJobTitle() {
            return jobTitle;
        }
        public double getSalary() {
            return salary;
        }
        public char getGender() {
            return gender;
        }
        public void setName(String name) {
            if(name.isEmpty()|| name.isBlank()){
                System.out.println("Invalid name :"+name);
                System.exit(0);
            }
            this.name = name;
        }
        public void setEmployeeID(int employeeID) {
            if(employeeID<=0){
                System.out.println("Invalid employee Id :"+employeeID);
                System.exit(0);
            }
            this.employeeID = employeeID;
        }
        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }
        public void setSalary(double salary) {
            if(salary<=0){
                System.out.println("Invalid salary "+ salary);
                System.exit(0);
            }
            this.salary = salary;
        }

        public void setGender(char gender) {
            gender=(""+gender).toUpperCase().charAt(0);
            if(!(gender=='M' || gender=='F') ){
                System.out.println("Invalid gender "+ gender);
                System.exit(0);
            }
            this.gender = gender;
        }

        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", gender='" + gender + '\'' +
                    ", salary= $" + salary +
                    '}';
        }

        public void coding() {
            System.out.println(name + " is coding");
        }

        public void unitTesting() {
            System.out.println(name + " is  unit testing");
        }

        public void fixingBug() {
            System.out.println(name + " is fixing bugs");
        }
    }
}