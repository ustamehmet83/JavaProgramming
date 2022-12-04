package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    /*
        7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a mail adress: ");
        String email= scan.next();
        int underscore = email.indexOf('_');
        int et= email.indexOf('@');
        System.out.println(email.substring(underscore+1,et)+"_"+email.substring(0,underscore)+email.substring(et));







    }
}
