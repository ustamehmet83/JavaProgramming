package day14_String;

public class Email_substring {
    public static void main(String[] args) {
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your email adress:");
        String email=scan.nextLine();

        String domain =email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain = " + domain);
        */


        System.out.println("------------------------------------------");
        String str1="Java is fun, Java is cool, I love Java";
        String s2;//Java is cool

        String s1= str1.substring(0,10+1);//Java is fun
        System.out.println(s1);
        int beg= str1.lastIndexOf(", J");
        int end=str1.lastIndexOf(",");

        String s3=str1.substring(beg+2,end);
        System.out.println(s3);

        int beg3=str1.lastIndexOf("I");
        String s4=str1.substring(beg3);
        System.out.println(s4);


    }

}
