package day22_MultiDimensinalArray;

public class ForEachLoop {
    public static void main(String[] args) {
// index of the element  0 1 2   0 1 2 3   0 1  2 3  4
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
//index number of arrays:  0       1           2

        for (int[] each1Array:arr2D) {
            for (int each:each1Array) {
                System.out.print(each+" ");
            }
            System.out.println();
        }





    }
}
