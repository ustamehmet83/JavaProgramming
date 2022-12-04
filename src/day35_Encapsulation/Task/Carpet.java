package day35_Encapsulation.Task;

public class Carpet {
    private double width,length;
    private double unitPrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setIsPersian(isPersian);
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width :"+width);
            System.exit(0);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<0){
            System.err.println("Invalid length :"+length);
            System.exit(0);
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<=0){
            System.err.println("Invalid unit price :"+unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setIsPersian(boolean persian) {
        this.isPersian = persian;
    }

    public double calcCost(){
        double cost=width*length*unitPrice;

        return  (isPersian)?cost+200:cost;

    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost= $" + calcCost() +
                '}';
    }
}
