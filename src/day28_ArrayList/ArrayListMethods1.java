package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        //add(Data): adds the data after the last index of the ArrayList
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        //add(index,Data): inserts the data at the given index
        numbers.add(2, 25);//2
        numbers.add(5, 45);//5
        System.out.println(numbers);

        // size(): returns the total number of elements
        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);

        // get(index): returns the element at the given index
        int num = numbers.get(3); // unboxing
        System.out.println("num = " + num);
        System.out.println("----------------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-----------------------");

        //set(index, Data): replaces the element at the given index
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("----------------------");

        // remove(int index) : remove the element at the given index
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        System.out.println("---------------------");

        //remove(object):the given object from arraylist,
        //remove element and returns boolean
        boolean r1=employees.remove("Hulya");
        System.out.println(r1);//true
        employees.remove("Hulya");
        System.out.println(employees);
        employees.remove("Neira");
        System.out.println(employees);








    }
}
