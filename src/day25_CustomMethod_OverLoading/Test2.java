package day25_CustomMethod_OverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------");

        double [] arr2={1.5,2.5,3.5,4.5,5.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------");

        char [] arr3={'a','b','c','d','e'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------");

        String [] arr4={"Ali","Veli","Cuma","Alper","Mehmet"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-------------------");

        int[] n1={10,2,3,4,5,6};
        int max1=ArraysUtility.max(n1);
        System.out.println(max1);
        System.out.println("--------------");

        double [] n2={1.5,2.5,3.5,4.5,5.5};
        double max2=ArraysUtility.max(n2);
        System.out.println(max2);

        int[] n3={10,2,3,4,5,6};
        int [] reverse=ArraysUtility.reverseArray(n3);
        System.out.println(Arrays.toString(reverse));
        boolean containInt=ArraysUtility.contains(n3,7);
        System.out.println(containInt);






        double [] n4={1.5,2.5,3.5,4.5,5.5};
        boolean contain=ArraysUtility.contains(n4,5.5);
        System.out.println(contain);

    }
}
