package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] number = {3, 5, 7, 1, 11};

        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {
                min=number[i];
            }
        }
        System.out.println(min);
    }
}
