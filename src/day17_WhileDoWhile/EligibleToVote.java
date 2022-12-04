package day17_WhileDoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt(); //valid age: 1~120
        while(!(age>=1 && age<=120)){
            System.out.println("Invalid entry, please re-enter: ");
            System.out.println("Enter your age: ");
            age=scan.nextInt();
        }
        System.out.println("Are you a US citize? yes/no");
        String answer=scan.next();
        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid entry, please re-enter: ");
            System.out.println("Are you a US citize? yes/no");
            answer= scan.next().toLowerCase();
        }





    }

}
