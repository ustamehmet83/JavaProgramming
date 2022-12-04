package day14_String;

import java.util.Scanner;

public class FirstLastChrSame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length() - 1);

        if (ch1 == ch2) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }


    }


}
