package day14_String;

import java.util.Scanner;

public class FirstLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence=scan.nextLine();
        char ch1=sentence.charAt(0);
        char ch2=sentence.charAt(sentence.length()-1);
        System.out.println(ch1+" "+ch2);


    }
}
