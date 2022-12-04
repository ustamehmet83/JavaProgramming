package day15_ForLoop;

import java.util.Scanner;

public class RetireCharacters {
    /*
        5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        String digits = "";
        String letter = "";
        String specialChars = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                digits += word.charAt(i);
            } else if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') || (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                letter += word.charAt(i);
            } else {
                specialChars += word.charAt(i);
            }
        }
        System.out.println("letters: " + letter);
        System.out.println("digits: " + digits);
        System.out.print("special chars: " + specialChars);

    }
}
