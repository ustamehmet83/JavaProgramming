package day19_NestedLoopRecap;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 && score > 100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (score <= 100 && score >= 90) {
                System.out.println("Grade is A ");
            } else if (score <= 89 && score >= 80) {
                System.out.println("Grade is B ");
            } else if (score <= 79 && score >= 70) {
                System.out.println("Grade is C ");
            } else if (score <= 69 && score >= 60) {
                System.out.println("Grade is D ");
            }else{
                System.out.println("Grade is F ");
            }

            System.out.println("Would you like to continue?");
            String answer=scan.next().toLowerCase();

            while(!(answer.equals("no")|| answer.equals("yes"))){
                System.out.println("Invalid Entry");
                System.exit(0);

            }
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }


        }

    }
}


