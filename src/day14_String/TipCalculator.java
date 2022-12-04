package day14_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = scan.next();

        System.out.println("Enter the number of people");
        int numOfPeople = scan.nextInt();
        System.out.println("Enter the check amount: ");
        int amount = scan.nextInt();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();
        System.out.println("Number of people entered: " + numOfPeople);
        double total = 0;
        if (quality.equalsIgnoreCase("Excellent")) {
            total = amount * 1.25;
        } else if (quality.equalsIgnoreCase("Great")) {
            total = amount * 1.2;
        } else if (quality.equalsIgnoreCase("Good")) {
            total = amount * 1.15;
        } else if (quality.equalsIgnoreCase("Fair")) {
            total = amount * 1.1;
        } else {
            total = amount * 1.05;
        }
        double totalTip=(total-amount);
        System.out.println("Total to pay: "+total);
        System.out.println("Total tip: "+totalTip);
        double perPerson= 0;
        double tipPerPerson=0;
        if (split.equalsIgnoreCase("Yes")) {
            System.out.println("Total per person: "+ (perPerson = total / numOfPeople));
            System.out.println("Tip per person: "+(tipPerPerson = (totalTip / numOfPeople)));
        }
        scan.close();
    }


}

