package day15_ForLoop;

public class SumofOddNumbers {
    /*
    2. Write a program that can return the sum of odd numbers between 1 to 100
     */
    public static void main(String[] args) {
        int sumOfOddnumbers=0;
        for (int i = 3; i <100 ; i+=2) {
            sumOfOddnumbers+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sumOfOddnumbers);
    }
}

