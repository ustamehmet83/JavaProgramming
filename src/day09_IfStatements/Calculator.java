package day09_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        char mathOperator = '+';
        double n1 = 15;
        double n2 = 20;
        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/') {
            if (mathOperator == '+') {
                System.out.println(n1 + n2);
            } else if (mathOperator == '-') {
                System.out.println(n1 - n2);
            } else if (mathOperator == '*') {
                System.out.println(n1 * n2);
            } else {
                System.out.println(n1 / n2);
            }
        } else {
            System.out.println("invalid operator");
        }


    }
}
