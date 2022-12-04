package day25_CustomMethod_OverLoading;


import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);
        String str1 = StringUtility.reverse(str);
        System.out.println(str1);
        System.out.println("-------------------------");

        boolean palindrome = StringUtility.isPalindrome("Java");
        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String name : names) {
            if (StringUtility.isPalindrome(name)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("--------------------------");

        String s2="aaaaaaaaaabbbbbbbbccccccccccdddddddddeeeeeeeeer";
        String s3=StringUtility.removeDuplicates(s2);
        System.out.println(s3);





    }




}
