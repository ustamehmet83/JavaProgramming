package day33_Statics.Task;

public class Iphone {
    public String model;
    public double price;
    public String color;
    public String size;
    public static String brand;
    public static String OS;
    public static String madeIn;

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }



    static {
        brand="13 pro";
        OS="IOS 5";
        madeIn="China";
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(email);
    }
    public void cal(long phoneNumber){
        System.out.println(phoneNumber);
    }
    public void text(long phoneNumber) {
        System.out.println(phoneNumber);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Iphone iphone=new Iphone("3310",200,"blue","m");
        iphone.text(58);
    }
}
