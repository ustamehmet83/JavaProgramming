package day19_NestedLoopRecap;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            int radius = scan.nextInt();



            if (radius <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double diameter = radius * 2;
            double area = radius * radius * 3.14;
            double perimeter = diameter * 3.14;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry,please re-enter:");
                a = scan.next();
            }
            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }

    }


}



