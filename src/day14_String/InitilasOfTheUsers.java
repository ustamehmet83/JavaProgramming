package day14_String;

import java.util.Scanner;

public class InitilasOfTheUsers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" enter word : ");
        String word1= scan.next();
        String word2= scan.next();

        word1=word1.toUpperCase();
        char ch1 =word1.charAt(0);

        word2=word2.toUpperCase();
        char ch2=word2.charAt(0);

        System.out.println(ch1+"."+ch2);





    }




}
