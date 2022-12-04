package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int array[]={1,2,3,4,5};
        int reversed[]=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {

            reversed[i]=array[j];

        }

        System.out.println(Arrays.toString(reversed));









    }
}
