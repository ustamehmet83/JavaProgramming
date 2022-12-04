package day14_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three word: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int lWord1 = word1.length();
        int lWord2 = word2.length();
        int lWord3 = word3.length();

        if (lWord1 == lWord2 && lWord2 == lWord3) {
            System.out.println("All words are same length");
        } else if ((lWord1 == lWord2 && lWord2 != lWord3) || (lWord1 == lWord3 && lWord1 != lWord2)||(lWord2 == lWord3 && lWord1 != lWord2)) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }


    }


}
