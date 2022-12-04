package day21_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {
        int [] arr1={30,20,10};
        int [] arr2={15,40,25,35};
        int [] arr3={8,9,17,5,4,1};

        int[] merge=new int[arr1.length+arr2.length+arr3.length];
int i=0;
        for (int arr:arr1) {
            merge[i++]=arr;
        }
        for (int arr:arr2) {
            merge[i++]=arr;
        }
        for (int arr:arr3) {
            merge[i++]=arr;
        }

        System.out.println(Arrays.toString(merge));
    }
}
