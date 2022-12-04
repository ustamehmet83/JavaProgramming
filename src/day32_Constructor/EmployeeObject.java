package day32_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Aaron", 'F',"SDET");

        Employee employee2= new Employee("Ahmet",'M');

        Employee employee3= new Employee("Mehmet",'M',"SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }



}
