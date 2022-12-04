package day29_ArrayList;

import java.util.ArrayList;

public class FindMaxMinAverage {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);

        Integer max = numbers.get(0);
        Integer min = numbers.get(0);
        Integer sum = 0;
        Integer average = numbers.get(0);

        for (Integer num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        for (Integer num : numbers) {
            if (min > num) {
                min = num;
            }
        }
        for (Integer num : numbers) {
            sum += num;
        }
        average = sum / numbers.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);


    }
}
