package day19_NestedLoopRecap;

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while(true){
            System.out.println("How much you make an hour?");
            double hourlyRate= scan.nextInt();

            if(hourlyRate<=0){
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHour= scan.nextInt();
            if(weeklyHour<1 || weeklyHour>144){
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double taxRate=scan.nextDouble();
            if(taxRate<0 || taxRate>10){
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary=hourlyRate*weeklyHour*52;
            double federalTax=grossSalary*0.26;
            double stateTax=taxRate/100*grossSalary;
            double totalTax= federalTax+stateTax;
            double netIncome=grossSalary-federalTax-stateTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer= scan.next().toLowerCase();

            if(!(answer.equals("yes")|| answer.equals("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
             if(answer.equals("no")){
                 System.out.println("Thank you for using Cydeo Salary Calculator APP");
                 break;
             }





        }








    }
}
