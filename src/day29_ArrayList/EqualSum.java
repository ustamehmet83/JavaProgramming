package day29_ArrayList;

public class EqualSum {
    public static void main(String[] args) {
        int [] numbers={1,1,1,1,1,1,6,6};

        int sumright=0;
        int sumleft =0;

        for (int i = 0,j=numbers.length-1; i <numbers.length; ) {
            if(sumright>sumleft){
                sumleft+=numbers[j];
                j--;
            }else{
                sumright+=numbers[i];
                i++;
            }
            if((i==j)&&(sumright==sumleft)){
                System.out.println(i);
                break;
            }
        }
    }
}
