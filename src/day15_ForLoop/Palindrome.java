package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    /*
    	8. Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a word: ");
        String word= scan.nextLine();
String reverse="";
        for (int i = 1; i <= word.length(); i++) {

            reverse+=word.charAt(word.length()-i);

        }

        System.out.println(word.equalsIgnoreCase(reverse));
    }
}
