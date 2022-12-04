package day23_CustomMethods_void;

public class CustomMethodWithParameters {
    // create a function that can check if a number is odd number or even number
    public static void main(String[] args) {
        oddOrEven(6);
        ageOfPerson(2000);
        printNumber(5,10);
    }

    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println( number+" is even number");
        }else{
            System.out.println( number+" is odd number");
        }
    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is: "+age);

    }

//create a function that can print all the numbers between x and y
    public static void printNumber(int x,int y){
        for (int i = x+1; i <y; i++) {
            System.out.print(i+" ");
        }
    }






}
