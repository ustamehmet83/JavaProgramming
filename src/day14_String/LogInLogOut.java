package day14_String;

import java.util.Scanner;

public class LogInLogOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter username: ");
        String username= scan.next();
        System.out.println("enter password: ");
        String password = scan.next();

        if((username.equals("Cydeo")&& (password.equals("WoodenSpoon")))){

            System.out.println("Logged in.");
        }else{
            System.out.println("IOncorrect username or password");
        }






    }
}
