package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible for vote : " + isEligible);

        System.out.println(" ---------------------------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 42;
        int income = 4000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 6000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);


        System.out.println("-------------------------------------------");

        String name3 = "Shay";

        int age3 = 23;

        char gender = 'M';

        boolean isEligible3 = age3 >= 18 && (gender == 'F' || gender == 'M');
        System.out.println(name3 + " is eligible : " + isEligible3);


    }


}
