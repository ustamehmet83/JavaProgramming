package day33_Statics;

public class TestIphone {


    public static void main(String[] args) {

        System.out.println(Iphone.brand);

        System.out.println(Iphone.OS);
        Iphone iphone1= new Iphone();
        iphone1.printOS();



    }
}
