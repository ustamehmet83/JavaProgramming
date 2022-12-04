package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    // reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    //checks if the given String is palindrome, return boolean
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }


    //checks if the given string is anagram,returns boolean
    public static boolean anagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }


    //removeDuplicates the duplicates from string, return String.
    public static String removeDuplicates(String str){
        String str2="";
        for (int i = 0; i <str.length() ; i++) {
            if(!str2.contains(""+str.charAt(i))){
                str2+=str.charAt(i);
            }
        }
        return str2;
    }

}
