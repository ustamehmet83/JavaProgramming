package day19_NestedLoopRecap;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("Enter the side of the square:");
            double side= scan.nextDouble();

            if(side<=0){
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area= side*side;
            double perimeter=4*side;
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            String answer=scan.next();

            while(!(answer.equals("yes")|| answer.equals("no"))){

                System.out.println("Invalid answer, please re-enter:");
            }
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }















    }
}
