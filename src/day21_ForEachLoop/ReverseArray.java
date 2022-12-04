package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = new int[number.length];
        /*       i          j
        reserved[0]=numbers[3]
        reserved[1]=numbers[2]
        reserved[2]=numbers[1]
        reserved[3]=numbers[0]
            .          .
            .          .
            .          .
            .          .
            .          .


        for (int i = number.length - 1; i >= 0; i--) {
            reversed[i] += number[number.length - 1 - i];
        }
*/

        for (int i = number.length - 1,j=0; i >= 0; i--,j++) {
            reversed[i]=number[j];
        }
        System.out.println(Arrays.toString(reversed));
    }


}

