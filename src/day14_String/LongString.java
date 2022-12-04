package day14_String;

import java.util.Scanner;

public class LongString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter two word: ");
        String word1=scan.next();
        String word2=scan.next();

        int longWord1=word1.length();
        int longWord2=word2.length();

        if (longWord1>longWord2){
            System.out.println(word1);
        }else if(longWord1<longWord2) {
            System.out.println(word2);
        }else{
            System.out.println(word1+"'s longs equal "+word2);
        }






    }
}
