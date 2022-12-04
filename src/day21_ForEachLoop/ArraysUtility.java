package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers={10,9,0,1,2,20,4,6,7,8,};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] nums={1,2,3,4,5};

        System.out.println(nums);   // [I@2d209079

        System.out.println(Arrays.toString(nums));   //   [1, 2, 3, 4, 5]

        String str="Java";

        System.out.println(str.toString());  //Java

        System.out.println("-----------------------");

        int[] scores={95,100,55,65,75,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));//[55, 65, 75, 78, 85, 95, 100]

        System.out.println("Min Scores = " + scores[0]);
        System.out.println("Max Scores = " + scores[scores.length-1]);

        String [] names={"Anna", "Ahmet", "Mehmet", "Huseyin", "Michael"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String [] words= {"Anna","anna","Ziya"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[Anna, Ziya, anna]


        System.out.println("---------------------------------");

        int[] arr1={1,2,3};
        int [] arr2 = {1,3,2};
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);//false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);//true


        System.out.println("-------------------------------");

        char[] ch1={'a','c','b',};
        char [] ch2={'b','c','a'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram =Arrays.equals(ch1,ch2);
        System.out.println(anagram);// true anagram






    }
}
