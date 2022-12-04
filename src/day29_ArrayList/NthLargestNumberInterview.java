package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumberInterview {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        /*
        int n = 3;
        int max = numbers.get(0);
        for (int j = 0; j < n; j++) {
            max = numbers.get(0);
            for (Integer num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            numbers.removeAll(Arrays.asList(max));
        }
        System.out.println(max);
         */
        int n=3;
        for (int i = 1; i <n ; i++) {
            numbers.removeIf(p-> Collections.max(numbers)==p);
        }
        int max=Collections.max(numbers);

        System.out.println(max);
    }
}
