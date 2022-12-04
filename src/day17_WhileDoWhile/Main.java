package day17_WhileDoWhile;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = scan.nextLine();
        double premiumCost = 0;
        name = name.toLowerCase();
        name = ("" + name.charAt(0)).toUpperCase() + name.substring(1, name.indexOf(" ")) +" "+ ("" + name.charAt(name.indexOf(" ") + 1)).toUpperCase()+
                name.substring((name.indexOf(" ")+2));

        System.out.println("Do you have a US driver license?");
        String license = scan.next();

        if (!license.equalsIgnoreCase("yes")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        if (zipCode.equals("20910") || zipCode.equals("20740")) {
            premiumCost += 60;

        } else if (zipCode.equals("22102") || zipCode.equals("22103")) {
            premiumCost += 30;
        } else {
            premiumCost += 50;
        }

        System.out.println("Is this vehicle owned, financed, or leased?");
        String ownership = scan.next();

        if (ownership.equals("owned")) {
            premiumCost += 10;

        } else if (ownership.equals("financed")) {
            premiumCost += 15;
        } else {
            premiumCost += 20;
        }

        System.out.println("How is this vehicle primarily used?");
        String primarilyUsed = scan.next();

        if (primarilyUsed.equals("business")) {
            premiumCost += 50;

        } else if (primarilyUsed.equals("pleasure")) {
            premiumCost += 10;
        } else {
            premiumCost += 20;
        }

        System.out.println("How many days do you commute?");
        int commuteDay = scan.nextInt();
        premiumCost += commuteDay * 5;


        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age <= 16) {
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age < 20 && age > 16) {
            premiumCost *= 10;
        } else if (age >= 20 && age < 25) {
            premiumCost *= 6;
        } else {
            premiumCost *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String hasAccident = scan.next();
        hasAccident.toLowerCase();

        if (hasAccident.equals("yes")) {
            System.out.println("How many?");
            int numaccident = scan.nextInt();
            premiumCost += numaccident * 10;
        }

        System.out.println("What is the highest level of education you have completed?");
        String eduLevel = scan.nextLine();

        if (eduLevel.equalsIgnoreCase("Bachelors") || eduLevel.equalsIgnoreCase("Masters")) {
            premiumCost = premiumCost * 0.95;

        } else if (eduLevel.equalsIgnoreCase("PHD")) {
            premiumCost = premiumCost * 0.9;

        } else {
            premiumCost = premiumCost * 1.1;

        }
        String referNum = name.substring(0, 2).toUpperCase() + age + name.substring((name.length()-3)).toUpperCase()+zipCode + eduLevel.toUpperCase().trim();
        System.out.println(name + ", here's your quote!");
        System.out.println("This is your start premium cost: $" + premiumCost);
        System.out.println("This is your reference number: " + referNum);
    }
}
