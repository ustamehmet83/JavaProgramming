package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str="Cydeo";
        String str1=str.repeat(4);//"CydeoCydeoCydeoCydeo"
        System.out.println(str1);

        String str2="Wooden Spoon";
        String st3=str2.repeat(100);
        System.out.println(st3);

        System.out.println("--------------------------");

        System.out.println("musta\n".repeat(4));

        String name= "Java";

        System.out.println((" "+ name).repeat(5));

    }
}
