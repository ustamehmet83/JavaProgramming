package day24_CustomMethod_Return;

import java.util.Scanner;

public class wordTotalFrequency {
    public static int getDup(String[] arr) {
        int count1 = 0;
        int count2 = 0;
        String new1 = "";
        for (String each : arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each)) {
                    count1++;
                }
            }
            if (count1 > 1) {
                if (!new1.contains(each)) {
                    new1 += each;
                    count2 += count1;
                }
            }
            count1 = 0;
        }
        return count2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }
}
