package day45_Abstraction;

public interface PropertiesOfInterface {
    int a=100; // static & final by default

    static int b=200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a=a;
    }

    static {
        b=10;
    }

    public void method1(){
        System.out.println("Instance method");
    }
     */

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method();

    public default void drink(){
        System.out.println("Default method");
    }
}
class Test implements PropertiesOfInterface{

    @Override
    public void method() {

    }
}