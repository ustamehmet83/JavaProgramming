package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        /*

        for (char i = 'A', j=0; i <= 'Z'&& j< letters.length; i++,j++) {

            letters[j]=i;

        }

        System.out.println(Arrays.toString(letters));

        for (int i = 0, j='A'; i < letters.length; i++,j++) {//İ: index number 0~last index

            letters[i]=(char)j;

        }*/

        char ch = 'A';

        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("------------------------------------");

        char[] letter2=new char[26];

        for (int i = 0, j='Z'; i <letter2.length ; i++,j--) {

            letter2[i]=(char)j;
        }
        System.out.println(Arrays.toString(letter2));







    }
}
