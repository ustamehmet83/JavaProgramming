package day38_Inheritance.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;


    public Rectangle(double width,double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.out.println("invalid side");
            System.exit(0);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<=0){
            System.out.println("invalid side");
            System.exit(0);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +'\'' +
                ", length=" + length +'\'' +
                ", Area=" + area() +'\'' +
                ", Perimeter=" + perimeter() +'\'' +
                '}';
    }
}
