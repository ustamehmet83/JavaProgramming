package day14_String;

public class StringMethods3_substring {
    public static void main(String[] args) {
        //substring(beginning index,ending index)

        String word="Cydeo School";
                   //012345......
        String word1=word.substring(0,4);

        System.out.println("word1 = " + word1);
        String wordd=word.substring(0,4+1);
        System.out.println("word2 = " + wordd);
        
        String str1=word.substring(6);
        System.out.println("str1 = " + str1);// School

        String word2="Java Programming Language";
        String s1= word2.substring(0,word2.indexOf(" "));//"Java"
        String s2= word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));//"Programming"
        String s3 =word2.substring(word2.lastIndexOf(" ")+1);;//"Language"
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);




    }
}
