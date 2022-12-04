package day35_Encapsulation.Task;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1= new Carpet(-5,10,10,true);
        System.out.println(carpet1);

        Carpet carpet2= new Carpet(5,10,10,true);
        System.out.println(carpet2);
        carpet1.setLength(20);
        System.out.println(carpet1);
    }
}
