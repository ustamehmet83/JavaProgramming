package day35_Encapsulation.Task;

public class Rectangle {
    private double width,length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*width*length;
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +'\''+
                ", length=" + length +'\''+
                ", area=" + calcArea() +'\''+
                ", perimeter=" + calcPerimeter() +'\''+
                '}';
    }
}
