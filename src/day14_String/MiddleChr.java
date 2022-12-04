package day14_String;

import java.util.Scanner;

public class MiddleChr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word:");
        String word = scan.next();

        int lengthWord = word.length();

        if (lengthWord < 3) {
            System.out.println("Word is too short");
        } else if (lengthWord == 3) {
            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            }

        } else {
            System.out.println("word is too long");
        }


    }
}
