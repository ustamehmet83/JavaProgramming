package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement {

    // removes the given index number of element from the array,return new array
    public static int[] remove(int [] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index : "+ index);
            System.exit(0);
        }

        int [] result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static double[] remove(double [] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index : "+ index);
            System.exit(0);
        }

        double [] result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static char[] remove(char [] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index : "+ index);
            System.exit(0);
        }

        char [] result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static String[] remove(String [] array,int index){

        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index : "+ index);
            System.exit(0);
        }

        String [] result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }







    public static void main(String[] args) {
        int [] arr1={10,20,30,40,50};
        int [] removed=remove(arr1,10);
        System.out.println(Arrays.toString(removed));
    }







}
