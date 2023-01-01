package day38_Inheritance.Shape;

public class Shape {
    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(0);
        }
        if(name.isEmpty()||name.isBlank()){
            System.out.println("invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }


    public String toString() {
        return "Shape{}";
    }

}
