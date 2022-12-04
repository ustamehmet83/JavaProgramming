package day31_Constructors;

import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static String extractNum(String s) {
        char[] s1 = s.toCharArray();
        String s2="";
        for (char each : s1) {
            if (Character.isDigit(each)) {
                s2 += each;
            }
        }
        return s2;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }


}
