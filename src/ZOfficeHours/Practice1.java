package ZOfficeHours;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
                18
              2226
           333334
         444444442
       55555555550
         */
        //practice5();
        //practices6();
        practices7();
    }
    public static void practice5(){
        for (int i = 10, j=1; i > 0; i-=2,j++) {
            System.out.println(" ".repeat(i)+((j)+"").repeat(11-i));
        }
    }

    public static void practices6(){
        String word="qwertyuopğasdfghjklşizxcvbnmç";

        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if((ch=='a'||ch=='e'||word.charAt(i)=='i'||ch=='o'||ch=='u' )){
                System.out.print(ch+" ");
            }
        }

    }

    public static void practices7(){
        String password="data";

        Scanner scan=new Scanner(System.in);
        int i=2;
        while(true){
            System.out.println("Enter your password");
            String pass= scan.next();
            if (password.equals(pass)){
                System.out.println("valid password");
                break;
            }
            System.out.println("invalid password");
            i--;
            if(i==0){
                System.out.println("Your account is deactivated");
                break;
            }
        }
    }










}
