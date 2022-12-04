package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result = 200 > 40;

        System.out.println("result = " + result);

        boolean result2 = 300 >= 40;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);


        System.out.println("-------------------");

        int x = 100;

        int y = 200;

        boolean isEqual = x == y;

        System.out.println("isEqual = " + isEqual);

        boolean isEqual2 = "Mehmet" == "Good guy";

        System.out.println("isEqual = " + isEqual);

        boolean isEqual3 = 'A' == 'a';

        System.out.println("isEqual3 = " + isEqual3);

        boolean isEqual4 = "Java" == "java";

        System.out.println("isEqual4 = " + isEqual4);

        boolean isEqual5 = "Java" == "   Java    ";

        System.out.println("isEqual5 = " + isEqual5);

        System.out.println("-------------------");


        boolean result1 = 100 != 200;

        System.out.println("result1 = " + result1);

        boolean result12 = "Java" != "java";

        System.out.println("result2 = " + result12);

        boolean result13 = 300.0 !=300;

        System.out.println("result13 = " + result13);

        int x1 = 5;
        int y1 = 6;
        String z1= "Mehmet";

        System.out.println(x1+y1+z1);











    }


}
