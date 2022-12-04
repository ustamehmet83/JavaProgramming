package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int []array={1,1,2,2,3,3,4,5,6};
        int [] unique =uniqueElements(array);
        System.out.println(Arrays.toString(unique));


        double []array2={1.5,1.5,2.5,2.5,3.5,3.5,4.5,5.5,6.5};
        double [] unique2 =uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));
        



    }









    //returns the unique elements of the array as a new array
    public static int [] uniqueElements(int []arr){
        int [] result={};
        for (int each:arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //returns the unique elements of the array as a new array
    public static double [] uniqueElements(double []arr){
        double [] result={};
        for (double each:arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //returns the unique elements of the array as a new array
    public static char [] uniqueElements(char []arr){
        char [] result={};
        for (char each:arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //returns the unique elements of the array as a new array
    public static String [] uniqueElements(String []arr){
        String [] result={};
        for (String each:arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }







}
