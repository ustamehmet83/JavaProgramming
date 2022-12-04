package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int [] arr2= addInteger(arr,6);
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------");
        double [] arr3={1.5,2.5,3.5,4.5,5.5};
        double [] arr4= addDouble(arr3,5.5);
        System.out.println(Arrays.toString(arr4));

        System.out.println("----------------------");
        char [] arr5={'a','b','c','d','e'};
        char [] arr6= addChar(arr5,'f');
        System.out.println(Arrays.toString(arr6));

        System.out.println("----------------------");
        String [] arr7={"Tatiana","Oleksandr","Cassandra","Ali","Veli"};
        String [] names= addString(arr7,"Neira");
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------");
        String [] arr8={"Tatiana","Oleksandr","Cassandra","Ali","Veli"};
        String [] array= new String[arr8.length+1];
        array = Arrays.copyOf(arr8,arr8.length+1);
        System.out.println(Arrays.toString(array));


    }
    public static int[] addInteger(int [] arr, int element){
        int [] arr2 = new int[arr.length+1];

        int i=0;
        for (int each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static double[] addDouble(double [] arr, double element){
        double [] arr2 = new double[arr.length+1];
        int i=0;
        for (double each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static String [] addString(String [] arr, String element){

        String [] arr2 = new String[arr.length+1];
        int i=0;
        for (String each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static char[] addChar(char [] arr, char element){

        char [] arr2 = new char[arr.length+1];
        int i=0;
        for (char each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
}
