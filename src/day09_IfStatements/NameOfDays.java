package day09_IfStatements;

public class NameOfDays {
    public static void main(String[] args) {

        int n=1;
        String day;

        if (n == 1) {
            //System.out.println(n + " is Monday");
            day="Monday";
        } else if ( n==2) {
            //System.out.println(n + " is Tuesday");
            day="Tuesday";
        } else if ( n==3) {
            //System.out.println(n + " is Wednesday");
            day="Wednesday";
        }else if ( n==4) {
            //System.out.println(n + " is Thursday");
            day="Thursday";
        } else if ( n==5) {
            //System.out.println(n + " is Friday");
            day="Friday";
        } else if ( n==6) {
            //System.out.println(n + " is Saturday");
            day="Saturday";
        } else {
            //System.out.println(n + " is Sunday");
            day="Sunday";
        }
        System.out.println("day = " + day);


    }


}
