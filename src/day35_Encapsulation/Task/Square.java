package day35_Encapsulation.Task;

public class Square {
    private double side;
    public static double  pi;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if (side<=0){
            return;
        }
        this.side = side;
    }
    static {
        pi=3.14;
    }
    public double calcArea(){
        return pi*side*side;
    }
    public double calcPerimeter(){
        return 2*pi*side;
    }
    public String toString() {
        return "Square{" +'\''+
                "side=" + side +'\''+
                "area=" + calcArea() +'\''+
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
