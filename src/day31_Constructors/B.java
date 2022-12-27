package day31_Constructors;

public class B {
    static int count;
    public B(){
        count++;
    }
    public B(int i){
        count+=i;
    }
    public B(String s){
        count+=s.length();
    }

}
class Test{
    public static void main(String[] args) {
        new B();// count=1
        B a= new B();// count=2
        B a2=new B("word");// count=6
        B a3=new B(5);// count=11
        System.out.println(B.count);





    }
}
