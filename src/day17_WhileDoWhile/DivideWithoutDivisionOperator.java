package day17_WhileDoWhile;

import java.util.Scanner;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter divided number: ");
        int divided = scan.nextInt();
        System.out.println("enter divisor number: ");

        int divisor = scan.nextInt();
        int division = 0;

        while (divided >= divisor) {
            divided -= divisor;//30 23 16 9 2
            division++;
        }
        System.out.println("division :" + division);
        System.out.println("remainder: " + divided);
    }
}
