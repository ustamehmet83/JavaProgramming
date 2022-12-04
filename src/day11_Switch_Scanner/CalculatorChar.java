package day11_Switch_Scanner;
public class CalculatorChar {
    public static void main(String[] args) {
        char operator = '+';
        double n1 = 30,
                n2 = 15;
        boolean valid = operator == '+' || (operator == '-') || operator == '*' || operator == '/';

        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
            }
        } else {
            System.err.println("invalid operator : "+operator);
        }


    }
}
