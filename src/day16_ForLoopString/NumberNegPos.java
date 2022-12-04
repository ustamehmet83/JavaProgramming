package day16_ForLoopString;

import java.util.Scanner;

public class NumberNegPos {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        String pos="";
        String neg="";
        for (int i = 0; i <5 ; i++) {
            int number=scan.nextInt();
            if (number<0){
                neg+=1;
            } else if (number>0) {
                pos+=1;
            }else{
            }
        }
        System.out.println(pos.length()+" positive and "+neg.length()+" negative");
    }
}
