package day13_String;

public class Anagram {

    public static void main(String[] args) {
        String str1="Listen";
        String str2="silent";
        String str3 = str2;
        String str4=str1;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();


        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                str2 = str2.replaceFirst("" + str1.charAt(i), "");
            }
        }
        if (str2.isBlank()) {
            System.out.println(str4 + " and " + str3 + " are anagram");
        } else {
            System.out.println(str4 + " and " + str3 + " are not anagram");
        }
    }

}
