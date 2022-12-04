package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    /*
    	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scan.nextInt();
        int fac=1;
        for (int i = 1; i <= number; i++) {

            fac*=i;

        }
        System.out.println(fac);




    }
}
