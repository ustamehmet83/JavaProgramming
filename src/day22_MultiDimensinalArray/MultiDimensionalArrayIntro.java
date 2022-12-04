package day22_MultiDimensinalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};
        String[][] groups = new String[3][];//index:0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups));//toString() is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
        // index of the element   0 1 2   0 1 2 3   0 1  2 3  4
                 int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index number of arrays:    0       1           2
        System.out.println(Arrays.deepToString(arr2D));
        int [] number=arr2D[0];//{1,2,3}
        int number1= arr2D[1][3];// 7

        System.out.println(Arrays.toString(number));
        System.out.println(number1);





    }
}
