package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);//
        System.out.println(num+1);//124
        System.out.println(str+1);// 1231

        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = "+ max);
        System.out.println("min = "+min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1="true";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println("s1 = " + s1);

        String s10="false";
        boolean r=Boolean.parseBoolean(s10);
        System.out.println("r = " + r);

        System.out.println("------------");

        String s2="123";
        Integer x=Integer.valueOf(s2);//Integer
        int y =Integer.valueOf(s2);//Integer unboxing
        System.out.println(x);
        System.out.println(y);

        String s3="1.5";
        Double z=Double.valueOf(s3);//Double
        System.out.println(z);

        System.out.println("----------------------");


        char ch1='0';
        //isDigit()
        boolean r2=Character.isDigit(ch1);
        System.out.println("r2 = " + r2);

        char ch2='A';
        //isLetter()
        boolean r3=Character.isLetter(ch2);
        System.out.println("r3 = " + r3);

        //isLetterOrDigit() special char
        boolean r4=!Character.isLetterOrDigit(ch2);
        System.out.println("r4 = " + r4);

        //upperCase
        boolean r5=Character.isUpperCase(ch2);
        System.out.println("r5 = " + r5);

        //upperCase
        boolean r6=Character.isLowerCase(ch2);
        System.out.println("r6 = " + r6);

        System.out.println("----------------");

        String s="ab1cde2efg3hi4";
        int sum=0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println("sum = " + sum);



    }


}
