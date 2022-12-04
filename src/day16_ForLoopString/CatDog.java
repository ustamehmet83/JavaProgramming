package day16_ForLoopString;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentences: ");
        String word= scan.nextLine();
        String word1="cat";
        String word2="dog";
        int catnum=0;
        int dognum=0;
        for (int i = 0; i-1 < word.length()-3; i++) {

            String part=word.substring(i,i+3);

            if (part.equalsIgnoreCase("cat")){
                catnum++;
            }
            if (part.equalsIgnoreCase("dog")){
                dognum++;
            }
        }
        if(catnum==dognum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
