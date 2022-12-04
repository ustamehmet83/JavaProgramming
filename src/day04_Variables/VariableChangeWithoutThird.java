package day04_Variables;

public class VariableChangeWithoutThird {
    public static void main(String[] args) {
        int x=9;
        int y=5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("--------------------");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
