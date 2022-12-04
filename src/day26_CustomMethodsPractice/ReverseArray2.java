package day26_CustomMethodsPractice;

public class ReverseArray2 {

    //reverses the given array, returns a new array
    public static int [] reverse(int [] arr1){

        int [] result= new int[arr1.length];
        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr1[i];
        }
        return result;
    }
    public static double [] reverse(double [] arr1){

        double [] result= new double[arr1.length];
        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr1[i];
        }
        return result;
    }
    public static char [] reverse(char [] arr1){

        char [] result= new char[arr1.length];
        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr1[i];
        }
        return result;
    }
    public static String [] reverse(String [] arr1){

        String [] result= new String[arr1.length];
        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr1[i];
        }
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
