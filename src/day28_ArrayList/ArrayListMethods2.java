package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num=1;

        list.remove(num);

        */
        //list.remove(200);//IndexOutOfBoundException
        Integer num = 200;
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------");

        // clear() : remove all the elements of the arraylist, size will be 0;

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------");

        //indexOf(data):returns the first matching
        // element's index number, returns int

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =characters.indexOf('A');// 0
        int b =characters.lastIndexOf('A'); //4
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("--------------------");

        // contains(Data) : returns true if the element is
        // contained in the arraylist,otherwise it returns false
        
        boolean r2=characters.contains('A');
        boolean r3=characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------");

        //equals(ArrayList):returns true if two arraylists are equal
        //(same elements in same order),otherwise returns false

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);//false
        System.out.println(list1.equals(list2));//true

        System.out.println("---------------------");

        boolean r4= list1.isEmpty();//false

        System.out.println("r4 = " + r4);

        list1.clear();

        boolean r5= list1.isEmpty();

        System.out.println("r5 = " + r5);

        System.out.println("--------------------");

        ArrayList<Integer> numbers=new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);


        
        
        
        
        


    }
}
