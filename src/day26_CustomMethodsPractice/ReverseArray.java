package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    //reverses the given array, returns a new array
    public static int [] reverse(int [] arr1){
        int []reverse={};
        for (int i = arr1.length - 1; i >= 0; i--) {
            reverse= ArraysUtility.addElement(reverse,arr1[i]);
        }
        return reverse;
    }
    public static double [] reverse(double [] arr1){
        double []reverse={};
        for (int i = arr1.length - 1; i >= 0; i--) {
            reverse= ArraysUtility.addElement(reverse,arr1[i]);
        }
        return reverse;
    }


















    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []reversed=reverse(arr1);
        System.out.println(Arrays.toString(reversed));
    }







}
