package day33_Statics.Task;

public class Circle {
    public int radius,diameter;
    public static double pi=3.14;


    public Circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + 2*radius +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


    public static void main(String[] args) {
        Circle circle1=new Circle(5,15);
        System.out.println(circle1);
    }
}
