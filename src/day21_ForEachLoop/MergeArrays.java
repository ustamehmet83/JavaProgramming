package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] number2 = {6, 7, 8, 9};

        int[] merge = new int[number1.length + number2.length];

        Arrays.copyOfRange(number1, 0, number1.length);
        System.out.println(Arrays.toString(merge));

/*

        for (int i = 0; i < number1.length; i++) {
            merge[i]=number1[i];
        }
        for (int i = 0; i < merge.length-number1.length; i++) {
            merge[number1.length+i]=number2[i];
        }

 */
        int i = 0;
        for (int each : number1) {

            merge[i++] = each;

        }
        for (int each : number2) {

            merge[i++] = each;

        }
        System.out.println(Arrays.toString(merge));

        System.out.println("-----------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] ch3 = new char[ch1.length + ch2.length];
        int j = 0;
        for (char each : ch1) {
            ch3[j++]=each;
        }
        for (char each : ch2) {
            ch3[j++]=each;
        }
        System.out.println(Arrays.toString(ch3));
    }
}
