package day35_Encapsulation.Task;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Invalid quantity :" + quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Invalid price :" + price);
            System.exit(0);
        }
            this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public double calcCost(){
        return quantity*price;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", unit price=" + ( (price==0)?"Free":price)+
                ", total price=" + ( (calcCost()==0)?"Free":calcCost())  +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}