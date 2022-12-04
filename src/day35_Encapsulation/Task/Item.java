package day35_Encapsulation.Task;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name :"+ name);
            System.exit(0);
        }
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == ' ')){
                System.out.println("Invalid name :"+ name);
                System.exit(0);
            }
        }

        if (!Character.isLetter(name.charAt(0))){
            System.out.println("Invalid name :"+ name);
            System.exit(0);
        }


        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.out.println("Invalid unit price :"+unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Invalid quantity: "+quantity);
            System.exit(1);
        }

        if(name.equalsIgnoreCase("toilet paper")){
            this.quantity = 1;
            return;
        }

        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
