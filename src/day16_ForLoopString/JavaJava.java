package day16_ForLoopString;

import java.util.Scanner;

public class JavaJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String chr = "Java";
        int sum = 0;
        for (int i = 0; i - 1 < str.length() - chr.length(); i++) {
            String eachSub = str.substring(i, i + chr.length());
            if (eachSub.equals(chr)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}