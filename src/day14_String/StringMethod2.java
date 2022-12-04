package day14_String;

import java.sql.SQLOutput;

public class StringMethod2 {
    public static void main(String[] args) {

        // replace(oldValue,newValue)

        String str = " Java is fun, I love learning Java";

        str.replace("Java", "Python");

        String str1=str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
        
        String email="JohnSmith@yahoo.com";
        System.out.println("email = " + email);
        String email2=email.replace("yahoo","gmail");
        System.out.println("email2 = " + email2);

        String sentence= "Java Java Python Python C# C# Python Python Python Python";
        System.out.println("sentence = " + sentence);
        String sentence1=sentence.replace("Python","");
        System.out.println("sentence1 = " + sentence1);
        String sentence2=sentence1.replace("   "," ");
        System.out.println("sentence2 = " + sentence2);
        
        String s="Dog Dog Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);

        String s2="C# is fun, C# is cool";
        s2=s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);//C# is fun, Java is cool, because of space.

        String s3= "Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);// Jeve

        System.out.println("-------------------------------");
                            //REPLACEFİRST

        String result= "Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println("result = " + result);

        String result2= "C# is fun, C# is cool";
        result2=result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);

        String result3= "Java";
        result3=result3.replaceFirst("a","o");
        System.out.println("result3 = " + result3);//Jova





        







    }
}
