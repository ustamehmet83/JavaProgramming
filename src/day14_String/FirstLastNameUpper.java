package day14_String;

public class FirstLastNameUpper {
    public static void main(String[] args) {

        String firstName="cyDEo";
        String lastName= "SCHOOL";

        firstName=firstName.toUpperCase();
        char firstCh= firstName.charAt(0);
        String otherPart=firstName.substring(1).toLowerCase();
        System.out.println(firstCh+otherPart);

        lastName=lastName.toUpperCase();
        char firstCh1= lastName.charAt(0);
        String otherPart1=lastName.substring(1).toLowerCase();
        System.out.println(firstCh1+otherPart);
    }
}
