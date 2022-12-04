package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Hourly Rate: ");
        double hourlyrate = scan.nextDouble();
        System.out.println("Enter How many hours you work in a week?:");
        int hours = scan.nextInt();
        System.out.println("Enter Your State Tax (In Percentage): ");
        double stateTaxPercentage = scan.nextDouble();
        System.out.println("Enter Your Federal Tax (In Percentage): ");
        double federalTaxPercentage = scan.nextDouble();
        double salary = hourlyrate * hours*52;
        double stateTax = salary * stateTaxPercentage;
        double federaltax = salary * federalTaxPercentage;
        double netIncome = salary - stateTax - federaltax;
        System.out.println("Salary is :" + salary);
        System.out.println("State Tax is: " + stateTax);
        System.out.println("Federal Tax is:" + federaltax);
        System.out.println("Net Income is " + netIncome);

        scan.close();
    }
}
