package day24_CustomMethod_Return;

public class IsArrayContainsNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int num=1;
        boolean IsArrayContainsNumber=IsArrayContainsNumber(arr,num);
        System.out.println(IsArrayContainsNumber);

    }
    public static boolean IsArrayContainsNumber(int[] arr, int num) {
        boolean IsArrayContainsNumber = false;
        for (int each : arr) {
            if (each == num) {
                IsArrayContainsNumber = true;
            }
        }
        return IsArrayContainsNumber;
    }
}
