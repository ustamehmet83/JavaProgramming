package day27_WrapperClasses;

import java.util.Arrays;

public class InsertGivenElement {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        retrieveTheLetters(str);

        int[] num = {1, 2, 3, 4, 5};

        int[] newnum = insertElement(num, 2, 100);
        System.out.println(Arrays.toString(newnum));

    }


    public static int[] insertElement(int[] array, int index, int element) {

        if (!(index >= 0 && index < array.length)) {
            System.out.println("invalid index");
            System.exit(0);
        }
        int[] newArray = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            if (i == index) {
                newArray[i++] = element;
            }
            newArray[i++] = each;
        }
        return newArray;
    }






    public static int[] swapElement(int[] arr1, int i, int j) {
        if (!((i >= 0 && i < arr1.length && j >= 0 && j < arr1.length))) {
            System.out.println("invalid index");
            System.exit(0);
        }
        int k = 0;
        k = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = k;
        return arr1;

    }

    public static void retrieveTheLetters(String str) {
        char[] str1 = str.toCharArray();
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : str1) {
            if (Character.isDigit(each)) {
                digits += each;
            }
            if (Character.isLetter(each)) {
                letters += each;
            }
            if (!Character.isLetterOrDigit(each)) {
                specialChars += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

    public static boolean isLowerUpperEqual(String str) {
        boolean isEqual = false;
        char[] chr = str.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        for (char each : chr) {
            if (Character.isUpperCase(each)) {
                countUpper++;
            }
        }
        for (char each : chr) {
            if (Character.isLowerCase(each)) {
                countLower++;
            }
        }
        if (countUpper == countLower) {
            isEqual = true;
        }
        return isEqual;
    }


}
