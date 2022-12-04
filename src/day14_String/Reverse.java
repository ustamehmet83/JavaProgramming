package day14_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string: ");
        String reverse = scan.next();

        int lreverse = reverse.length();

        if(lreverse<5){
            System.out.println("Too short!");
        } else if (lreverse>5) {
            System.out.println("Too long!");

        }else{
            System.out.println(reverse);
        }


    }
}
