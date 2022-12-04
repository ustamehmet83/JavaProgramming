package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan", "Germany", "Korea", "United States", "United Kingdom", "United Arab Emirates"};
        ArrayList<String> countryList = new ArrayList<>(Arrays.asList(countries)); // non-primitive array
        countryList.removeIf(p -> p.length() >= 10);
        System.out.println(countryList);

        // converting arraylist to array
        /*
        String[] country2 = new String[countryList.size()];
        int i = 0;
        for (String each : countryList) {
            country2[i++] = each;
        }
        System.out.println(Arrays.toString(country2));*/

        countries=countryList.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));
    }
}

