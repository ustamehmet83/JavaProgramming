package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";
            //index  01234
        char thirdChar= word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch.";

        int totalChars=s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar= s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------------------");

        String str = "WOODEN SPOON";
        str =str.toUpperCase();
        System.out.println("str = " + str);

        System.out.println("--------------------------------");

        String s = "JAVA";
        s.toUpperCase();

        System.out.println("------------------------------------");

        String sentence= "This is good day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);









    }
}
