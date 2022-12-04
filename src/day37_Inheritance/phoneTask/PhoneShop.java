package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "White");


        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");
        Nokia nokia = new Nokia("Brick", "4 inches", 500, "Gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("---------------------");

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789654323);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("----------------------------");

        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();

        System.out.println("----------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Nokia.hasBattery);

    }
}
