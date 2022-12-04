package day31_Constructors;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;
        this.federalTaxRate = federalTaxRate / 100;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double totalStateTax() {
        return salary() * stateTaxRate;
    }

    public double totalFederalTax() {

        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {
        return salary() - totalFederalTax() - totalStateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Salary =" + salary() +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
