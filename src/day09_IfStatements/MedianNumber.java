package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 30, b = 70, c = 60;
        boolean isMedian_a = (b>a && a>c) || (a>b && c>a);
        boolean isMedian_b = (a>b && b>c) || (b>a && c>b);
        boolean isMedian_c = (a>c && c>b)|| (c>a && b>c);

        if (isMedian_a) {

            System.out.println(a + " is the median number");

        }
        if (isMedian_b) {

            System.out.println(b + " is the median number");

        }
        if (isMedian_c) {

            System.out.println(c + " is the median number");

        }


    }
}
