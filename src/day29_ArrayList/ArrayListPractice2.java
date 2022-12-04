package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String>employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Ahmet","Mehmet","Mustafa","David","Michael"));
        employees.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println(employees);


        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList());
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.retainAll(Arrays.asList(1,2));
        System.out.println(numbers);

        System.out.println("------------------------------");

        String []names ={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names));
        namesList.removeIf(p-> p.startsWith("M"));
        System.out.println(namesList);
        String[] names2=  namesList.toArray(new String[0]);
        System.out.println(Arrays.toString(names2));










    }
}
