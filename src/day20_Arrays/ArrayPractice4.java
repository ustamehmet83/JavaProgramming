package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {

        int[] number = new int[100];
        for (int i = 0, j = 0; i < 100; i++, j++) {

            number[i] = j;
        }
        System.out.println(Arrays.toString(number));


        int[] number2 = new int[100];
        for (int i = 0, j = 99; i < 100; i++, j--) {

            number2[i] = j;
        }
        System.out.println(Arrays.toString(number2));



        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();
        int [] number3=new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number: ");
            number3[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(number3));

    }
}
