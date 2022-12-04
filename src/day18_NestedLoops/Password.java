package day18_NestedLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String user=scan.next();

        System.out.println("Enter your password: ");
        String pass=scan.next();

        if (user.equals("Cydeo")&& pass.equals("WoodenSpoon")){
            System.out.println("Logged in");

        }else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Invalid username or password please re-enter:");
                System.out.println("Enter your username: ");
                user=scan.next();

                System.out.println("Enter your password: ");
                pass=scan.next();

                if (user.equals("Cydeo")&& pass.equals("WoodenSpoon")){
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(user.equals("Cydeo")&& pass.equals("WoodenSpoon"))){
                System.out.println("Your account is locked,please contact support team");
            }

        }










    }
}
