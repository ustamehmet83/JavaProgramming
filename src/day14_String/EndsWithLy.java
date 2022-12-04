package day14_String;

import java.util.Scanner;

public class EndsWithLy {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.next();

        if (word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

















    }
}
