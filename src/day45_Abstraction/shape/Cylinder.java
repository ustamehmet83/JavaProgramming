package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;

    public final static double pi;

    private double height;

    static {
        pi=3.14;
    }

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid radıus: "+radius);
        }

        this.radius = radius;
    }

    public void setHeight(double height) {
        if (radius<=0){
            throw new RuntimeException("Invalid height: "+height);
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 2*pi*radius*(radius+height);
    }

    @Override
    public double perimeter() {
        return 2 *(2*radius + height) ;
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }



    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "radius=" + radius +
                ", height=" + height +
                '}';
    }


}
