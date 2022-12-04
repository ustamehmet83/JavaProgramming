package day21_ForEachLoop;

import java.util.Arrays;

public class OddLeftEvenRight {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6,7,8,9};

        int []number=new int[numbers.length];

        int i=0;
        for (int each:numbers) {
            if(each%2!=0){
                number[i++]=each;
            }
        }
        for (int each:numbers) {
            if(each%2==0){
                number[i++]=each;
            }
        }
        System.out.println(Arrays.toString(number));




    }
}
