package day38_Inheritance.Shape;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("invalid side");
            System.exit(0);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + "Square" + '\'' +
                ", side=" + side +'\'' +
                ", Area=" + area() +'\'' +
                ", Perimeter=" + perimeter() +'\'' +
                '}';
    }
}
