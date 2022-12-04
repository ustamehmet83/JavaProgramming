package utilities;

public class MathUtility {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 6;
        double sum = sum(num1, num2);
        int num= 10;
        boolean isEven=isEven(num);
        System.out.println(sum);
        System.out.println(isEven);
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static boolean isEven(int num){
        return (num%2==0)?true:false;
    }
    public static boolean isOdd(int num){
        return (num%2!=0)?true:false;
    }

    public static int maxNumber(int num1,int num2){
        return (num1>num2)? num1:num2;
    }
    public static double maxNumber(double num1,double num2){
        return (num1<num2)? num1:num2;
    }
    public static int squareOfNumber(int num){
        return num*num;
    }
    public static double squareOfNumber(double num){
        return num*num;
    }
    public static int cubeOfNumber(int num){
        return num*num*num;
    }
    public static double cubeOfNumber(double num){
        return num*num*num;
    }








}
