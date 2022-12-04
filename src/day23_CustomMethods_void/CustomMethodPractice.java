package day23_CustomMethods_void;

public class CustomMethodPractice {

    public static void main(String[] args) {
        helloWorld5times();
        helloCydeo5times();
        evenNumbers();
    }











    //create a function that can print hello world 5 times
    public static void helloWorld5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    //create a function that can print hello Cydeo 5 times
    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }



    //create a function that print all the numbers from 1~10

    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i+" ");
        }

    }











}
