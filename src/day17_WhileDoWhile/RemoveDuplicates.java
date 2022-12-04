package day17_WhileDoWhile;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "AABBCC";
        String result=""; //"ABC"

        for (int i = 0; i < str.length(); i++) {
            String ch= ""+str.charAt(i);
            if(result.contains(ch)){//if the result already contains the charactes
                continue;//skips
            }
            result+=ch;
        }
    }
}
