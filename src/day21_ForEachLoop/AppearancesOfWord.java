package day21_ForEachLoop;

import java.util.Arrays;

public class AppearancesOfWord {
    public static void main(String[] args) {

        String sentence="ı love java and python python . ı begin to learn java and python";
        String[] s=sentence.split(" ");
        System.out.println(Arrays.toString(s));
        int javaCount=0;
        int pythonCount=0;
        for (String s1:s) {
                if (s1.equals("java")){
                    javaCount++;
                }
                if (s1.equals("python")){
                    pythonCount++;
                }

        }
        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);









    }
}
