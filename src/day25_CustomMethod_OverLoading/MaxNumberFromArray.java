package day25_CustomMethod_OverLoading;

import utilities.ArraysUtility;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int max=maxNumber(arr1);
        System.out.println(max);
    }



















    public static int maxNumber(int [] arr1){
        int max=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        return max;
    }





}
