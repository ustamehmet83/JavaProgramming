package day12_Scanner;

import java.util.Scanner;

public class CalculatorScannerChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter operator: ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter first number :");
        double n1 = scan.nextDouble();
        System.out.println("Enter second number :");
        double n2 = scan.nextDouble();
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
                    break;
            }
        } else {
            System.err.println("invalid operator : "+ operator);
        }


    }
}


