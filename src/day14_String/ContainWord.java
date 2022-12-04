package day14_String;

import java.util.Scanner;

public class ContainWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter sentence and word");
        String sentence=scan.nextLine();
        String word=scan.next();
        int firstIndex=sentence.indexOf(word);
        int secondIndex = sentence.indexOf(word,firstIndex+1);
        if(!sentence.contains(word)){
            System.out.println("sentence do not contains word");
        }else if (secondIndex>=0){
            System.out.println("sentence contains more than one word");

        }else{
            System.out.println("sentence contains only one word");
        }



    }
}
