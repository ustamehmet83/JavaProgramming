package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Aygun", 'F', 35, 22350, "Developer", 15000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Hulya", 'F', 40, 25350, "SDET", 10000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Ismet", 'M', 25, 25890, "SMaster", 20000, false);

        Employee employee4 = new Employee();
        employee4.setInfo("Ahmet", 'M', 29, 28890, "Architecture", 25000, false);

        Employee employee5 = new Employee();
        employee5.setInfo("Yusuf", 'M', 35, 30890, "PManager", 10000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countPartTime=0;
        for (Employee employee : employees) {

            if (employee.isFullTime) {
                countFullTime++;
            }else{
                countPartTime++;
            }
        }
        System.out.println("countPartTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        ;
        double max = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary > max) {
                max = employee.salary;
            }
        }
        System.out.println("max = " + max);
        double min = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.salary < min) {
                min = employee.salary;
            }
        }
        System.out.println("min = " + min);


    }
}
