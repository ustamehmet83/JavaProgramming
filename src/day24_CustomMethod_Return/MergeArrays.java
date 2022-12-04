package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2={4,5,6};
        int [] merge= mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(merge));

    }

    public static int [] mergeArrays(int [] arr1,int [] arr2){
        int [] merge =new int[arr1.length+arr2.length];
        int k=0;
        for (int i = 0; i < arr1.length; i++) {
            merge[k]=arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[k]=arr2[i];
            k++;
        }
        return merge;
    }
}
