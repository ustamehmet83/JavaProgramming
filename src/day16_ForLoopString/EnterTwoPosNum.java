package day16_ForLoopString;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EnterTwoPosNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < num1; i++) {
            if (num1 > 0 && num2 > 0) {
                sum += num2;
            }
        }
        if (num1 < 0 || num2 < 0) {
            System.out.println("invalid");
        } else if (num1 == 0 || num2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}

