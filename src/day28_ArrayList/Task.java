package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.set(list.size() - 1, 0);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.swap(list2, 0, list.size() - 1);
        System.out.println(list2);


        ArrayList<Integer> list21 = new ArrayList<>(Arrays.asList(1, 0, 0, 2, 3, 4, 5, 0, 6, 0, 8));

        int size = list21.size();
        list21.removeIf(p -> p == 0);
        int newSize = list21.size();
        for (int i = 0; i < size - newSize; i++) {
            list21.add(0);
        }
        System.out.println(list21);


        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) % 2 != 0) {
                list3.set(i, list3.get(i) * 2);
            }
        }
        System.out.println(list3);


        ArrayList<String> list4 = new ArrayList<>();
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        list4.addAll(Arrays.asList(arr1));
        list4.addAll(Arrays.asList(arr2));
        System.out.println(list4);

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Collections.max(list5));

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Collections.min(list6));

        ArrayList<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        for (int each : list7) {

            if (Collections.frequency(list7, each) > 1) {
                System.out.println(each);
                break;
            }
        }

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);
        ArrayList<Character> digits = new ArrayList<>(chars);
        ArrayList<Character> special = new ArrayList<>(chars);


        letters.removeIf(p -> !Character.isLetter(p));
        digits.removeIf(p -> !Character.isDigit(p));
        special.removeAll(letters);
        special.removeAll(digits);
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);


    }


}



