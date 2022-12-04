package day28_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(500);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(500);

        for (Integer each :numbers) {
            int count = 0;
            for (Integer number : numbers) {
                if (each==number) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
                break;
            }
        }
    }
}
