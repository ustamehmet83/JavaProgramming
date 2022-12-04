package day23_CustomMethods_void;

import java.util.Arrays;

public class Tasks01 {
    public static void oddNumbers1To100() {
        for (int i = 3; i < 101; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void evenNumbers1to100() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void isEligible(int age) {
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    public static void isEligibleToVote(int age, String nation) {

        if (age >= 20 && nation.equalsIgnoreCase("USA")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void gradeOfStudent(int score) {
        if (score <= 100 && score > 90) {
            System.out.println("Your grade is A");
        } else if (score <= 90 && score > 80) {
            System.out.println("Your grade is B");
        } else if (score <= 80 && score > 70) {
            System.out.println("Your grade is C");
        } else if (score <= 70 && score > 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }


    }

    public static void areaOfCircle(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }

    public static void areaOfSquare(int side) {
        double area = side * side;
        System.out.println(area);
    }

    public static void dollarToEuro(int dollar) {
        double euro = dollar * 1.01;
        System.out.println(dollar + " dollar = " + euro + " Euro");
    }

    public static void dollarToLira(int dollar) {
        double lira = dollar * 18.5;
        System.out.println(dollar + " dollar = " + lira + " tl");
    }

    public static void kgToLb(int kg) {
        int lbs = (int) (kg / 0.45);
        System.out.println(kg + " kg = " + lbs + " lb");
    }
    public static void isNegativePositiveOrZero(int num) {
        if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is zero");
        }
    }
    public static void printEachChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");
        }
    }
    public static void printEachElement(int number[]) {
        for (int each : number) {
            System.out.print(each + " ");
        }
    }

    public static void calculator(double num1, double num2, char mathOperator) {

        if (mathOperator == '*') {
            System.out.println(num1 * num2);
        } else if (mathOperator == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperator == '-') {
            System.out.println(num1 - num2);
        } else if (mathOperator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");
        }

    }
    public static void regularFormat(String[] fullName) {
        String fullName1 = "";
        for (String name : fullName) {
            fullName1 += (name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " ");
        }
        System.out.println(fullName1);
    }
    public static void isTwoStringAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
    public static void main(String[] args) {
        int[] data = {40, 50, 10, 30, 20, 5};
        oddNumbers1To100();//1
        System.out.println();
        evenNumbers1to100();//2
        System.out.println();
        isEligible(20);//3
        System.out.println();
        isEligibleToVote(19, "usa");//4
        System.out.println();
        gradeOfStudent(90);//5
        System.out.println();
        areaOfCircle(5);//6
        System.out.println();
        areaOfSquare(5);//7
        System.out.println();
        dollarToEuro(100);//9
        System.out.println();
        dollarToLira(100);//10
        System.out.println();
        kgToLb(100);//11
        System.out.println();
        isNegativePositiveOrZero(-0);//12
        System.out.println();
        printEachChar("word");//13
        System.out.println();
        printEachElement(data);//14
        System.out.println();
        calculator(5, 6, '*');//15
        System.out.println();
        String[] fullName = {"cYdEo", "SCHOOL"};//16
        regularFormat(fullName);
        System.out.println();
        isTwoStringAnagram("silent", "listen");//17
    }
}
