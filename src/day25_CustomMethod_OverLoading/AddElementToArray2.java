package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementToArray2 {
    public static void main(String[] args) {
        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);
        int [] intArray2= addElement(intArray,6);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);
        double [] doubleArray2= addElement(doubleArray,6.5);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
        char [] charArray2= addElement(charArray,'G');

        String [] names ={"Ahmet","Oleksandr","Sinem","Cihad"};
        names=addElement(names,"Layan");
        System.out.println(Arrays.toString(names));
    }

    public static int[] addElement(int [] arr, int element){
        int [] arr2 = new int[arr.length+1];

        int i=0;
        for (int each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static double[] addElement(double [] arr, double element){
        double [] arr2 = new double[arr.length+1];
        int i=0;
        for (double each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static String [] addElement(String [] arr, String element){

        String [] arr2 = new String[arr.length+1];
        int i=0;
        for (String each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
    public static char[] addElement(char [] arr, char element){

        char [] arr2 = new char[arr.length+1];
        int i=0;
        for (char each:arr) {
            arr2[i++]=each;
        }
        arr2[i]=element;
        return arr2;
    }
}
