package day21_ForEachLoop;

import java.util.Arrays;

public class SecondMinAndMax {
    public static void main(String[] args) {

        int[] n = {1, 2, 2, 1, 3, 5, 7, 8, 9, 34, 56, 56, 56, 34, 34};

        Arrays.sort(n);

        for (int each : n) {
            if (each > n[0]) {
                System.out.println("Second min number " + each);
                break;
            }
        }
        int i = 1;
        for (int j = n.length-1; j >=0 ; j--) {
            if (n[j] < n[n.length-1]) {
                System.out.println("Second min number " + n[j]);
                break;
            }
        }


    }
}
