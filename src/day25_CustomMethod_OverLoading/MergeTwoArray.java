package day25_CustomMethod_OverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2 ={5,6,7,8};
        int [] arr3= mergeTwoArray(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }








    public static int[]mergeTwoArray(int[]arr1, int []arr2){
        int []arr3={};
        for (int each:arr1) {
            arr3= ArraysUtility.addElement(arr3,each);
        }
        for (int each:arr2) {
            arr3= ArraysUtility.addElement(arr3,each);
        }
        return arr3;
    }
}
