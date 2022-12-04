package day14_String;

import java.util.Scanner;

public class AscııTable {
    /*
        5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

        HINT: 1. you need charAt() method
              2. Ascii Table
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        char firstchr = word.charAt(0);

        if (firstchr >= 48 && firstchr <= 57) {
            System.out.println("first character is digit");
        } else if (firstchr >= 97 && firstchr <= 122) {
            System.out.println("first character is lowercase letter");
        } else if (firstchr >= 65 && firstchr <= 90) {
            System.out.println("first character is uppercase letter");
        } else {
            System.out.println("first character is special character");
        }
    }
}
