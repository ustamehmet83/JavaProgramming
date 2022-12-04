package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    //removes the duplicates from the given array, returns the new array
    public static int [] removeDuplicates(int [] arr1){
        int [] result={};
        for (int each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static double [] removeDuplicates(double [] arr1){
        double [] result={};
        for (double each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static char [] removeDuplicates(char [] arr1){
        char [] result={};
        for (char each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }
    public static String [] removeDuplicates(String [] arr1){
        String [] result={};
        for (String each:arr1) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;

    }













    public static void main(String[] args) {
int []arr1={1,1,1,2,2,2,3,3,3,4,5,5,6,6};
int []arr2= removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr2));
    }
}


