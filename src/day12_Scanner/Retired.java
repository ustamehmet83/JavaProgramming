package day12_Scanner;

import java.util.Scanner;

public class Retired {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender :");
        char gender = scan.next().charAt(0);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int RetiredAgeMan = 65;
        int RetiredAgeWoman = 60;

        if (age >= 0 && (gender == 'f' || gender == 'm')) {
            if (gender == 'f' && age >= RetiredAgeWoman || gender == 'm' && age >= RetiredAgeMan) {
                System.out.println("You can be retired");
            } else if (gender == 'f' && age < RetiredAgeWoman) {
                System.out.println(RetiredAgeWoman - age + "after you can be retired");

            } else if (gender == 'm' && age < RetiredAgeMan) {
                System.out.println(RetiredAgeMan - age + "years after you can be retired");
            } else {
                System.out.println("invalid");
            }
        } else {
            System.out.println("Invalid Data");
        }

    }


}

