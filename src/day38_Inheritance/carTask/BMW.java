package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String model, int year, int price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+ " never break down");
    }
    public void racing(){
        System.out.println(brand+ " is racing");
    }
@Override
 public void start(){
     System.out.println("Call mechanic to jump start "+brand+" "+model);
 }




}
