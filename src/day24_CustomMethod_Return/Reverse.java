package day24_CustomMethod_Return;

public class Reverse {
    public static void main(String[] args) {
        String reverse=reverse("Java");
        System.out.println(reverse);
    }
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }









}

