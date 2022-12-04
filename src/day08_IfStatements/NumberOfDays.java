package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int number = 13;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 5 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;

        if (has31Days) {

            System.out.println("Month that has 31 days");

        }
        if (has30Days) {

            System.out.println("Month that has 30 days");

        }
        if (has28Days) {

            System.out.println("Month that has 28 days");

        }


    }



}
