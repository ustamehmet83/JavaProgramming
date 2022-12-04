package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
            // s.indexOf();
        String str1= "      batch 25      ";
        str1.trim();
        System.out.println(str1);// "      batch 25      "
        System.out.println(str1.trim());// removeDuplicates white spaces, not between characters "batch 25"
                                        // returns new String without teh white spaces(unused spaces)

        System.out.println("----------------------------------");

        String str2 = "Cydeo School";
        str2.indexOf("h");
        int n=str2.indexOf("h");
        System.out.println(str2.indexOf("h"));
        System.out.println("n = " + n);

        int n1 =str2.indexOf("o");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3="Java Programming Language";

        int n3 =str3.indexOf("a ");
        System.out.println("n3 = " + n3);

        int n4 =str3.indexOf("amm");
        System.out.println("n4 = " + n4);

        int n5 =str3.indexOf("an");
        System.out.println("n5 = " + n5);

        int n6 =str3.indexOf("g");
        System.out.println("n6 = " + n6);

        int n7 =str3.indexOf("g ");
        System.out.println("n7 = " + n7);

        System.out.println("------------------------------------------");

        int n8 =str3.lastIndexOf("g");// starts index right to left
        System.out.println("n8 = " + n8);

        String s = "Java Nova Cava Wawa orange";
        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA=s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        
        int fourthA=s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);//11
        
        fourthA=s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);//11

        fourthA=s.indexOf("Ca")+1;
        System.out.println("fourthA = " + fourthA);//11

        int fifth=s.indexOf("a W");
        System.out.println("fifth = " + fifth);

        int sixth=s.lastIndexOf("aw");
        System.out.println("fifth = " + fifth);
        
        int seventh=s.lastIndexOf("a ");//Even if counting starts from the right,
                                            // it's as if writing starts from the left.
        System.out.println("seventh = " + seventh);
        
        int eight= s.lastIndexOf("a");
        System.out.println("eight = " + eight);













    }
}
