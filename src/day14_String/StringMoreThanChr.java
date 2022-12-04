package day14_String;

import java.util.Scanner;

public class StringMoreThanChr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word:");
        String word= scan.next();

        int lengthWord= word.length();

        if(lengthWord==0){
            System.out.println("string is empty");
        }else if (lengthWord>3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word.substring(0));
        }








    }
}
