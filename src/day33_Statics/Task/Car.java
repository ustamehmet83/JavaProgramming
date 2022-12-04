package day33_Statics.Task;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public static int numberOfWheels=4;
    public static boolean hasBattery=true;
    public static boolean hasSeats=true;


    public void drive(){
        System.out.println(brand +"is driving" );
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
