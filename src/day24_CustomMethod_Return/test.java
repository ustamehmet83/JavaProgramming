package day24_CustomMethod_Return;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here java 4 va 2
        String sentenceNew="";
        for(int i=0;i<=main.length()-coverMe.length();i++){
            if(coverMe.equals(main.substring(i,i+coverMe.length()))){
                sentenceNew=main.replace(coverMe,"["+coverMe+"]");
            }                                //1        //3
        }
        if(!main.contains(coverMe)){
            sentenceNew="["+main+"]";
        }

        return sentenceNew;


    }
}
