package day18_NestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("number is even number");
            } else {
                System.out.println("number is odd number");
            }

            System.out.println("Would you like to enter another number ");
            String answer = scan.next().toLowerCase();

            if (answer.equals("no")) {
                break;
            }

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Enter invalid answer please re-enter:");
                answer = scan.next().toLowerCase();
            }



        }
    }
}
