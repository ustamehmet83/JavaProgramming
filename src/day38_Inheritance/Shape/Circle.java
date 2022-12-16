package day38_Inheritance.Shape;

public class Circle extends Shape{
    private double radius;
    public static double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.out.println("invalid radius");
            System.exit(0);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +'\'' +
                "pi=" + pi +'\'' +
                ", Area=" + area() +'\'' +
                ", Perimeter=" + perimeter() +'\'' +
                '}';
    }
}
