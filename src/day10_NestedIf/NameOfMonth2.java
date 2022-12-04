package day10_NestedIf;

import java.sql.SQLOutput;

public class NameOfMonth2 {
    public static void main(String[] args) {
        /*if (number>0 && number<13) {
            if (number==1)
            {System.out.println("Month is January");
            } else if (number==2) {
                System.out.println("Month is February");
            } else if (number==3) {
                System.out.println("Month is March");
            } else if (number==4) {
                System.out.println("Month is April");
            } else if (number==5) {
                System.out.println("Month is May");
            }else if (number==6) {
                System.out.println("Month is June");
            }else if (number==7) {
                System.out.println("Month is July");
            }else if (number==8) {
                System.out.println("Month is August");
            }else if (number==9) {
                System.out.println("Month is September");
            }else if (number==10) {
                System.out.println("Month is October");
            }else if (number==11) {
                System.out.println("Month is November");
            }else
                System.out.println("Month is December");
        }else{
            System.out.println("Number is invalid");


        int number = 13;
        String result = "";
        if (number > 0 && number < 13) {
            result = (number == 1 ? "Month is January" : number == 2 ? "Month is February" : number == 3 ? "Month is March" : number == 4 ? "Month is April":
            number == 5 ? "Month is May" : number == 6 ? "Month is June": number == 7 ? "Month is July" : number == 8 ? "Month is August":
            number == 9 ? "Month is September" : number == 10 ? "Month is October": number == 11 ? "Month is November" :"Month is December");
        } else {
            System.out.println("Number is invalid");
        }
        System.out.println(result);

         */
        int number = 12;
        String result = "";
            result = (number > 0 && number < 13)?(number == 1 ? "Month is January" : number == 2 ? "Month is February" : number == 3 ? "Month is March" : number == 4 ? "Month is April":
                    number == 5 ? "Month is May" : number == 6 ? "Month is June": number == 7 ? "Month is July" : number == 8 ? "Month is August":
                            number == 9 ? "Month is September" : number == 10 ? "Month is October": number == 11 ? "Month is November" :"Month is December"):"Number is invalid";

        System.out.println(result);

    }
}