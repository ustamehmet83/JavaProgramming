package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {


            sum += i;
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter number");
            sum1 += scan.nextInt();
        }

        System.out.println(sum1);

    }


}
