package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

      int [] numbers={10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) { //İ: indexes of the array
            int eachElement=numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("------------------------"); // each: element of array

        for (int each:numbers) {
            System.out.print(each+" ");
        }

        System.out.println("------------------------");




















    }
}
