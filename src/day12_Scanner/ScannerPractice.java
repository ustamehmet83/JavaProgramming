package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 to 7:");
        int number = scan.nextInt();
        String result="";
        if (number <= 7 && number >= 1) {
            result = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday"
                    : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(result);
        scan.close();

    }
}
