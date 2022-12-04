package day24_CustomMethod_Return;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        int [] arr1=reverseArray(arr);
        System.out.println(Arrays.toString(arr1));
    }
    public static int [] reverseArray(int [] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr1[i] = arr[j];
        }
        return arr1;
    }
}
