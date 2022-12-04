package day13_String;

public class IsEmptyIsBlank {
    public static void main(String[] args) {
        String name="";

        boolean isEmpty=name.isEmpty();
        System.out.println(isEmpty);//true
        boolean isBlank=name.isBlank();// true
        System.out.println(isBlank);

        System.out.println("---------------------");

        String name2="          ";
        boolean isEmpty2=name2.isEmpty();
        System.out.println(isEmpty2);//false
        boolean isBlank2=name2.isBlank();// true
        System.out.println(isBlank2);



    }
}
