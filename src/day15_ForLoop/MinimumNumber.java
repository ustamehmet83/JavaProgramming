package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            System.out.println("enter a number: ");
            if (num<min){
                min=num;
            }

        }

        System.out.println(min);
    }
}
