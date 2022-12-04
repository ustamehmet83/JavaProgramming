package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that's capable enough to contain 5 names
        String[] myGroup = new String[5];
        System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));

        int[] myGroup2 = new int[5];
        System.out.println(Arrays.toString(myGroup2));

        char[] mygroup3 = new char[6];
        System.out.println(Arrays.toString(mygroup3));

        double[] mygroup4 = new double[5];
        System.out.println(Arrays.toString(mygroup4));

        System.out.println(Arrays.toString(myGroup));//["Gunay","Neira","Suat","Hulya","Mikael"]

        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        System.out.println(Arrays.toString(myGroup));


        System.out.println("-----------------------------------------");

        String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);





















    }
}
