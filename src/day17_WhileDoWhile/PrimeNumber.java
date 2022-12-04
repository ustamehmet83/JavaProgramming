package day17_WhileDoWhile;
public class PrimeNumber {
    public static void main(String[] args) {
        int frequence = 0;
        for (int i = 2; i < 100; i++) {
            frequence = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    frequence++;
                }
            }
            if (frequence == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
