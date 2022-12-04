package day27_WrapperClasses;

public class Quiz {

    public static void main(String[] args) {
        int a=0;
        do {
            a=a++ + --a - (a%3);
        }while(++a<4);
        System.out.println(a);
        System.out.println("----------------------------------");
        String str="The whole time it was raining.";
        System.out.println(str.length());
        do {
            System.out.println(str.charAt(0));
            str=str.substring(6);
        }while(!str.isEmpty());

        System.out.println("----------------------------------");

        String s= "I will find the lost book";
        String word="";

        for (int index = s.length()-1; index <=0 ; index--) {
            word+=s.charAt(index);

        }
        System.out.println(word);

        byte[] b=new byte[5];
        for (int j = 0; j < b.length; j++) {
            b[j]=(byte)(b[j]*2);
        }
        System.out.println(b);

        System.out.println("----------------------------------");

        String str2= "cybertek";
        for (int i = 0; i <= str.length(); i+=2) {
            System.out.println(str.charAt(i));

        }

        }
    }


