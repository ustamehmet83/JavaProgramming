package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    //replace the element of the array at given index with new element,and returns the new array
    public static int [] replace(int [] array,int index,int element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static double [] replace(double [] array,int index,double element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static char [] replace(char [] array,int index,char element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }
    public static String [] replace(String [] array,int index,String element){
        if(index<0 || index>array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        array[index]=element;
        return array;
    }

    //replaces all the element of the array that matching with the given old element
    // with the given new element, and returns the new array
    public static int [] replaceAll(int [] array, int elementOld,int elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static double [] replaceAll(double [] array, double elementOld,double elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static char [] replaceAll(char [] array, char elementOld,char elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementOld){
                array[i]=elementNew;
            }
        }
        return array;
    }
    public static String [] replaceAll(String [] array, String elementOld,String elementNew){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(elementOld)){
                array[i]=elementNew;
            }
        }
        return array;
    }
    


    public static void main(String[] args) {
        String [] arr={"ali","veli","cuma","murtaza","ali"};
        String [] arr2=replaceAll(arr,"ali","veli");
        System.out.println(Arrays.toString(arr2));
    }





}
