package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1=scan.nextInt();

        System.out.println("Enter number2 :");
        int num2=scan.nextInt();

        System.out.println("Enter operator :");
        char ch=scan.next().charAt(0);

        while (!(ch== '+'||ch== '-'||ch=='*'||ch=='/')){

            System.out.println("Enter operator :");
             ch=scan.next().charAt(0);
        }
        switch(ch){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }









    }
}
