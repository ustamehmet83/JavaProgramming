package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String model, int year, int price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+ " is in auto pilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }
}


