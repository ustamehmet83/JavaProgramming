package day31_Constructors;

public class Items {
    public String name;
    public double unitPrice;
    public int quantity;

    public Items(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total Price="+ calcCost()+
                '}';
    }
}
