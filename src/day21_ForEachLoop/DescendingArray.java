package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingArray {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 6, 7, 8, 9, 10,2,4};

        Arrays.sort(numbers);

        int[] numbers2 = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            numbers2[i] = numbers[j];

        }
        System.out.println(Arrays.toString(numbers2));


    }
}
