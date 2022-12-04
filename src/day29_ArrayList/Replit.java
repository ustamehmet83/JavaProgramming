package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replit {
    public static void main(String[] args) {

        ArrayList<Integer>arr =new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int [] arr2={1,2,3,4,5};

        Collections.swap(arr,0,4); //[5,2,3,4,1]

        Collections.sort(arr);         // [1,2,3,4,5]

        Collections.reverse(arr);     // [5, 4, 3, 2, 1]

        arr.toArray();
        System.out.println(arr);

        System.out.println(Collections.max(arr));//5

        System.out.println(arr);














    }
}
