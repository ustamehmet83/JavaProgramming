package ZInterview;

import java.util.Arrays;

public class Interview {

    public static void main(String[] args) {

        int[] A = {12};
        int[] B = {5,3,1,7,8,9,10,11,12};
        int a = solution(A, B);
        System.out.println(a);

    }


    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        if(m>n){
            int [] C; C=B; i=n;B=A; n=m;A=C; m=i;i=0;
        }
        for (int k = 0; k < n;k++) {
                          //5    //12
            if (i < m-1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    static class Solution {
        public static void main(String[] args) {
            int [] a ={100,20,30,-20,-15};
            int b=solution(a);
            System.out.println(b);
        }
        public static int solution(int[] A){
            int sum=0;
            for (int each:A) {
                if((each<=-10 && each>=-99)||(each>=10 && each<=99)){
                    sum+=each;
                }
            }
            return sum;
        }









    }
}
