package day21_ForEachLoop;

import java.util.Arrays;

public class ZeroEndOfArray {
    public static void main(String[] args) {

        int array[]={10,0,5,0,1,0};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int array2[]=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {

            array2[j]=array[i];

        }

        System.out.println(Arrays.toString(array2));





    }
}
