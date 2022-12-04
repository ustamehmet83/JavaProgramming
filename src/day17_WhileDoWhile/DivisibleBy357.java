package day17_WhileDoWhile;

import java.util.Scanner;

public class DivisibleBy357 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String div15 = "";
        String div5 = "";
        String div3 = "";
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                div15+=i+" ";
            } else if (i % 5 == 0) {
                div5+=i+" ";
            } else if (i % 3 == 0) {
                div3+=i+" ";
            }
        }
        System.out.println("Divisible By 15 " + div15);
        System.out.println("Divisible By 5 " + div5);
        System.out.println("Divisible By 3 " + div3);
    }
}
