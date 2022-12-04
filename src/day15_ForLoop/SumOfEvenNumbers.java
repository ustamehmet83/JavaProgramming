package day15_ForLoop;

public class SumOfEvenNumbers {
    /*
    	1. Write a program that can return the sum of even numbers between 1 to 100
     */
    public static void main(String[] args) {
        int sumOfEven= 0;

        for (int i = 2; i <100 ; i+=2) {
            sumOfEven+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sumOfEven);








    }
}
