package day24_CustomMethod_Return;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        boolean isAnagram=isAnagram("silent","listen");
        System.out.println(isAnagram);

    }

    public static boolean isAnagram(String str1, String str2) {
        boolean isanagram = false;
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) {
            isanagram = true;
        }
        return isanagram;
    }


}



