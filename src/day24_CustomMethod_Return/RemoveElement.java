package day24_CustomMethod_Return;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
int []arr1=removeElement(array,index);
        System.out.println(Arrays.toString(arr1));

    }
    public static int [] removeElement(int [] array,int index){
        int [] arr1= new int[array.length-1];
        for (int i = 0,j=0; i < array.length; i++,j++) {
            if(i==index){
                i++;
            }
            arr1[j]=array[i];
        }
        return arr1;
    }

}
