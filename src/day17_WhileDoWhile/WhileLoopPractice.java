package day17_WhileDoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //username="Cydeo"
        //password="Cydeo1234"

        String userName = "Cydeo";
        String passWord = "Cydeo1234";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        int countuser = 0;
        int countpass = 0;
        int attempt = 3;
        String user = scan.next();
        while (!user.equals(userName) && !(countuser == attempt)) {
            countuser++;
            if (countuser == attempt) {
                System.out.println("your account is locked");
            } else {
                System.out.println("re-enter username");
            }
            if (countuser != attempt) {
                user = scan.next();
            }
        }
        if (user.equals(userName)) {
            System.out.println("enter password: ");
            user = scan.next();
            while (!user.equals(passWord) && !(countpass == attempt)) {
                countpass++;
                if (countpass == 2) {
                    System.out.println("last chance");
                }
                if (countpass == attempt) {
                    System.out.println("your account is locked");
                } else {
                    System.out.println("re-enter password");
                }
                if (countuser != attempt) {
                    user = scan.next();
                }

            }
            if (attempt != countpass && countuser != attempt) {
                System.out.println("you are entered");
            }
        }
    }
}