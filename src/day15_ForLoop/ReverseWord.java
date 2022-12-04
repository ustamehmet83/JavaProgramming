package day15_ForLoop;

import java.util.Scanner;

public class ReverseWord {
    /*
    	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word: ");
        String word=scan.nextLine();
        String reverse="";
        for (int i = 1; i <=word.length(); i++) {

            reverse+=word.charAt(word.length()-i);
        }
        System.out.println(reverse);






    }
}
