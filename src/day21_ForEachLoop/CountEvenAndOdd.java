package day21_ForEachLoop;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 8, 9, 10,2,4};
int countOdd=0;
int countEven=0;
        for (int even:numbers) {

            if(even%2==0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println("Even number is "+countEven);
        System.out.println("Odd number is "+countOdd);








    }
}
