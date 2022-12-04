package day17_WhileDoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you marry me: ");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, please re-enter: ");
            System.out.println("Are you marry me: ");
            answer=scan.next();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }







    }
}
