package day24_CustomMethod_Return;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int[]arr2=addElement(arr,4);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] addElement(int [] arr, int num){
        int [] arr2= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=num;
        return arr2;
    }

}
