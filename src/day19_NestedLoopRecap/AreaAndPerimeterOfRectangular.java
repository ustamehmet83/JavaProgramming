package day19_NestedLoopRecap;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangular {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter the length of the Rectangle:");
            int length= scan.nextInt();
            System.out.println("Enter the width of the Rectangle:");
            int width=scan.nextInt();
            if(length<=0){
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            if(width<=0){
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double area= width*length;
            double perimeter= 2*(width+length);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another Rectangle");
            String answer=scan.next().toLowerCase();
            while(!(answer.equals("no")|| answer.equals("yes"))){
                System.err.println("Invalid entre, please re-enter!");
                answer=scan.next().toLowerCase();
            }
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }







        }




















    }
}
