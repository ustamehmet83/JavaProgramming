package day22_MultiDimensinalArray;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6},{7,8,9}};

        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }
        int[] reverse = new int[length];
        for (int i = 0,k=0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                reverse[k++] = array[i][j];
            }
        }
        for (int i = array.length-1,l=0; i >=0; i--) {
            for (int j = array[i].length-1; j >=0; j--) {
                array[i][j] = reverse[l++];
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}



