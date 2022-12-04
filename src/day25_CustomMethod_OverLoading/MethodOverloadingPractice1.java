package day25_CustomMethod_OverLoading;

public class MethodOverloadingPractice1 {
    public static void main(String[] args) {
        
        
    }
    public static int [] merge(int [] arr1, int [] arr2){
        int [] arr3 = new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1) {
            arr3[i++]=each;
        }
        for (int each:arr2) {
            arr3[i++]=each;
        }
        return arr3;
    }
    public static double [] merge(double [] arr1, double [] arr2){
        double [] arr3 = new double[arr1.length+arr2.length];
        int i=0;
        for (double each:arr1) {
            arr3[i++]=each;
        }
        for (double each:arr2) {
            arr3[i++]=each;
        }
        return arr3;
    }
    public static char [] merge(char [] arr1, char [] arr2){
        char [] arr3 = new char[arr1.length+arr2.length];
        int i=0;
        for (char each:arr1) {
            arr3[i++]=each;
        }
        for (char each:arr2) {
            arr3[i++]=each;
        }
        return arr3;
    }
    public static String [] merge(String [] arr1, String [] arr2){
        String [] arr3 = new String[arr1.length+arr2.length];
        int i=0;
        for (String each:arr1) {
            arr3[i++]=each;
        }
        for (String each:arr2) {
            arr3[i++]=each;
        }
        return arr3;
    }
    
    
    
    
    
}
