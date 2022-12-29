package day43_AbstractionIntro.car;

public final class Tesla extends Car{
    public Tesla(String brand, String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {

    }
}
