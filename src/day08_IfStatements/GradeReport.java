package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 0;


        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;

        if (a) {
            System.out.println(score + " is Excellent");
        }
        if (b) {
            System.out.println(score + " is Great");
        }
        if (c) {
            System.out.println(score + " is Good");
        }
        if (d) {
            System.out.println(score + " is Passed");
        }
        if (f) {
            System.out.println(score + " is Failed");
        }


    }


}
