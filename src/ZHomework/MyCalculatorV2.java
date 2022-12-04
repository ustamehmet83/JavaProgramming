package ZHomework;

public class MyCalculatorV2 {

    public int num1,num2;

    public void setInfo(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public String toString() {
        return "MyCalculatorV2{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
    public void plus(){
        System.out.println(num1+num2);
    }
    public void minus(){
        System.out.println(num1-num2);
    }
    public void multiply(){
        System.out.println(num1*num2);
    }
    public void divide(){
        System.out.println(num1/num2);
    }












}
