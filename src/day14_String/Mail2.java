package day14_String;

import java.util.Scanner;

public class Mail2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your email");
        String email=scan.next();
        if(!email.contains("@")){
            System.out.println("invalid email");
        } else if (!email.contains("gmail.com")) {
            System.out.println("enter gmail ");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("invalid word");

        }else {
            System.out.println("email was recorded succesfully");
        }


    }
}
