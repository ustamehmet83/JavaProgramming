package day24_CustomMethod_Return;

public class IsPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome=isPalindrome("Level");
        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(String str){
        String reverse="";
        boolean isPalindrome=false;
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)){
            isPalindrome=true;
        }
        return isPalindrome;
    }





}
