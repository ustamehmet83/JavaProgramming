package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Score :");
        int score = scan.nextInt();
        if (score >= 0 && score <= 100) {

            if (score <= 100 && score > 90) {
                System.out.println("A");
            } else if (score <= 89 && score > 80) {
                System.out.println("B");
            } else if (score <= 79 && score > 70) {
                System.out.println("C");
            } else if (score <= 69 && score > 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("Invalid Score");
        }

        scan.close();
    }
}
