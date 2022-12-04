package day16_ForLoopString;

import java.util.Scanner;

public class UniqueChr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) == word.lastIndexOf(ch)) {// also ((""+word.indexOf(word.charAt(i))).equals(""+word.lastIndexOf(word.charAt(i))))
                word2 += ch;

            }


        }
        System.out.println(word2);
    }
}