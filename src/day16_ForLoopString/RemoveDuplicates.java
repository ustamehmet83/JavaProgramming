package day16_ForLoopString;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
                if (!word2.contains(""+word.charAt(i))) {
                    word2+=word.charAt(i);
                }
            }
        System.out.println(word2);
        }

    }
