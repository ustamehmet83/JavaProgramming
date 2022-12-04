package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    /*
        8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
       Write a program that will print out information about user based on email. Print first name, last name, and domain.
       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
               Ex:
                   input:
                       craig_federighi@apple.com
                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a mail: ");
        String email = scan.next();
        int indexOfUnderscore = email.indexOf("_");
        int indexOfet = email.indexOf("@");
        int indexOfPoint = email.indexOf(".");

        String firstName = email.substring(0, indexOfUnderscore);
        String secondName = email.substring(indexOfUnderscore + 1, indexOfet);
        String domain = email.substring(indexOfet + 1, indexOfPoint);

        System.out.println("First name: " + (("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1)));
        System.out.println("Last name: " + (("" + secondName.charAt(0)).toUpperCase() + secondName.substring(1)));
        System.out.println("Last name: " + (domain.substring(0)));


    }
}
