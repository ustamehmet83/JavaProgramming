package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFacetime = true;

    public static void printModelAndPrice() {
        System.out.println(brand);
        //System.out.println(size,color);// static methods does not accept instances

    }

    public void printOS(){
        System.out.println(OS);
    }


}
