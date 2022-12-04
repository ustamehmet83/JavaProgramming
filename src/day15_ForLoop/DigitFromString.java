package day15_ForLoop;

import java.util.Scanner;

public class DigitFromString {
    /*
        6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        int sum = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) <= 57 && word.charAt(i) >= 48){
            sum +=(word.charAt(i)-48);
        }
        }
        System.out.println(sum);

    }
}
