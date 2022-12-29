package day43_AbstractionIntro.car;

public final class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void stop() {
        System.out.println("Press the break");
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }





}
