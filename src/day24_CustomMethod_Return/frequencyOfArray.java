package day24_CustomMethod_Return;

public class frequencyOfArray {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,1,2,2};
        int frequency=frequencyOfNumber(array,1);
        System.out.println(frequency);
    }

    public static int frequencyOfNumber(int[] array,int number){
        int frequency=0;
        for (int each:array) {
                if(each==number){
                    frequency++;
            }
        }
        return frequency;
    }







}
