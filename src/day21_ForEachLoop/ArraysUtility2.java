package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] student ={"Elif","Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String [] earlyBirds= Arrays.copyOf(student,20);
        System.out.println(Arrays.toString(earlyBirds));//[Elif, Sinem, Gunay]

        System.out.println("---------------------------------------");

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------");

        char[] ch1={'A','B','C','D','E','F','G','H','I'};
        char [] ch2= Arrays.copyOfRange(ch1,2,6);
        char [] ch3= Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));
        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------");

        int [] scores={10,20,30,40,50,60,70,80,90,100};
        int [] result= Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));


        int [] result2= Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));

        for(int each:scores){
            System.out.print(each+" ");
            if(each==40){
                break;
            }
        }
        for(int each:scores){
            System.out.print(each+" ");
        }


































    }
}
