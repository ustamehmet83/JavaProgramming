package day12_Scanner;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String userinput = input.nextLine();
        if (userinput == "admin"){
            System.out.println("Correct!");
        } else if (userinput != "admin"){
            System.out.println("Wrong!");
        }

    }
}
