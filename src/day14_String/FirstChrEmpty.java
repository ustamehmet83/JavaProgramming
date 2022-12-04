package day14_String;

import java.util.Scanner;

public class FirstChrEmpty {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord= scan.next();
        System.out.println("Enter second word: ");
        String secondWord = scan.next();
        System.out.print(firstWord.substring(1));
        System.out.println(secondWord.substring(1));
    }
}
