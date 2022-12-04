package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 105;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {

                System.out.println("Passed");

            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Score");

        }


        System.out.println("============================");

        int age = 21;

        boolean isEligible = age >= 21;
        boolean hasId = false;

        if (hasId) {
            if (isEligible) {
                System.out.println("Eligible to buy alcohol");

            } else {
                System.out.println("Not Eligible to buy alcohol");
            }


        } else {
            System.out.println("Yuo must have ID to buy alcohol");
        }

        System.out.println("===============================");


        int n = 8;
        String day;

        if (n > 0 && n < 8) {
            if (n == 1) {
                //System.out.println(n + " is Monday");
                day = "Monday";
            } else if (n == 2) {
                //System.out.println(n + " is Tuesday");
                day = "Tuesday";
            } else if (n == 3) {
                //System.out.println(n + " is Wednesday");
                day = "Wednesday";
            } else if (n == 4) {
                //System.out.println(n + " is Thursday");
                day = "Thursday";
            } else if (n == 5) {
                //System.out.println(n + " is Friday");
                day = "Friday";
            } else if (n == 6) {
                //System.out.println(n + " is Saturday");
                day = "Saturday";
            } else {
                //System.out.println(n + " is Sunday");
                day = "Sunday";
            }
            System.out.println("day = " + day);

        } else {

            System.out.println("number is invalid");
        }


    }


}
