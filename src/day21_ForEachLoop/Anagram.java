package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1="accb";
        String str2="bcca";

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println(str1+" and "+str2 +" is anagram");
        }else{
            System.out.println(str1+" and "+str2 +" is not anagram");
        }
















    }
}
