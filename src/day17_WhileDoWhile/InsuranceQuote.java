package day17_WhileDoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        /*
        6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
					Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
         */

        int price = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scan.nextLine();

        System.out.println("enter your gender ");
        String gender = scan.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.out.println("invalid entry,please enter valid gender ");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Are you married?(yes/no) ");
        String isMarried = scan.next().toLowerCase();

        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.out.println("invalid entry,please enter valid answer.Are you married? ");
            isMarried = scan.next().toLowerCase();
        }

        System.out.println("Enter your age ");
        int age = scan.nextInt();

        while (!(age > 0 && age < 120)) {
            System.out.println("invalid entry,please enter your age ");
            age = scan.nextInt();
        }

        System.out.println("how many miles he/she drives in a day ");
        int miles = scan.nextInt();

        while (!(miles > 5)) {
            System.out.println("invalid entry,please enter miles ");
            miles = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String InsuranceType = scan.nextLine();

        while (!(InsuranceType.equals("full coverage") || InsuranceType.equals("liability"))) {
            System.out.println("invalid entry,please enter insurance ");
            InsuranceType = scan.nextLine();
        }

        System.out.println("Do you  had any accidents or claims in past 5 years (Yes/No)");
        String accident = scan.next();

        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.out.println("invalid entry,please enter accident ");
            accident = scan.next();
        }
        System.out.println("Do you if have car  an anti-theft device (Yes/No)");
        String antiTheft = scan.next();
        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.out.println("invalid entry,please enter accident ");
            antiTheft = scan.next();
        }
        if (InsuranceType.equals("liability")) {

            if(age<25){
                price+=90;

            }else{
                price+=50;
            }
            if(miles<=10){
                price+=10;

            } else if (miles>50) {
                price+=50;
            }else{
                price+=30;
            }

        } else if (InsuranceType.equals("full coverage")) {
            if(age<25){
                price+=160;

            }else{
                price+=120;
            }
            if(miles<=10){
                price+=20;

            } else if (miles>50) {
                price+=70;
            }else{
                price+=40;
            }
        }
        if(antiTheft.equals("yes")){
            price*=0.95;
        }
        if(accident.equals("yes")){
            price*=1.15;
        }else {
            price*=0.9;
        }
        if (isMarried.equals("yes")){
            price*=0.9;
        }
        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + isMarried);
        System.out.println("Has Anti-Theft Device = " + antiTheft);
        System.out.println("Had Accident Or Claims = " + accident);
        System.out.println("InsuranceType = " + InsuranceType);
        System.out.println("Your insurance price is: "+price);

        scan.close();
    }


}
