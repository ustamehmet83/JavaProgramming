package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,3,4,5,5};
        int n =frequencyOfElement(arr,5);
        System.out.println(n);



    }






    public static int frequencyOfElement(int [] array,int element){
        int frequency=0;
        for (int each:array) {
                if(each==element){
                    frequency++;
                }
        }
        return frequency;
    }
    public static int frequencyOfElement(double[] array,double element){
        int frequency=0;
        for (double each:array) {
            if(each==element){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(char[] array,char element){
        int frequency=0;
        for (char each:array) {
            if(each==element){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(String[] array,String element){
        int frequency=0;
        for (String each:array) {
            if(each.equals(element)){
                frequency++;
            }
        }
        return frequency;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
