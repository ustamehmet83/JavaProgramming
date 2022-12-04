package day22_MultiDimensinalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};

        int[][] arr2D1= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2D2= {{10,11,12},{13,14,15},{16,17,18}};

        // 3 dimensional array 2 d arrays
        //                    0      1       2           0          1          2
        //                 0 1 2   0 1 2   0 1 2     0   1  2   0   1  2    0  1  2
        int[][][] arr3D={{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
        //                           0                                   1
        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));//[[10, 11, 12], [13, 14, 15], [16, 17, 18]]
        System.out.println(Arrays.toString(arr3D[1][1]));//[13, 14, 15]
        System.out.println(arr3D[0][2][2]);//9

        for (int [][] each2D:arr3D) {
            for (int [] each1D:each2D) {
                for (int each :each1D) {
                    System.out.print(each+" ");

                }
                System.out.println();
            }
        }
        System.out.println("---------------------------");

        int [][][][] arr4D={{{{1,2,3},{4,5,6}},{{10,11,12},{13,14,15}}},{{{1,2,3},{4,5,6}},{{10,11,12},{13,14,15}}}};
//                                            0                                            1

        for (int [][][] each3D:arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int each:each1D) {
                        System.out.print(each+" ");
                    }
                    System.out.println();
                }

            }
        }





    }
}
