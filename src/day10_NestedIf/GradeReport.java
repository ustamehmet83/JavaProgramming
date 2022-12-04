package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int grade = 5;


        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("Excellent");

            } else if (grade >= 80) {
                System.out.println("Great");

            } else if (grade >= 70) {
                System.out.println("Good");

            } else if (grade >= 60) {
                System.out.println("Passed");

            } else if (grade <= 59) {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Grade is Invalid");
        }


        System.out.println("==========================================");

        String result = "";

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                result = "Excellent";

            } else if (grade >= 80) {
                result="Great";

            } else if (grade >= 70) {
                result = "Good";

            } else if (grade >= 60) {
                result ="Passed";

            } else if (grade <= 59) {
                result ="Failed";
            }
        } else {
            result ="Grade is Invalid";
        }
        System.out.println(result);


    }
}
