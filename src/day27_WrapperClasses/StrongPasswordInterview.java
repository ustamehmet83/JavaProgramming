package day27_WrapperClasses;

public class StrongPasswordInterview {
    public static void main(String[] args) {
        String password = "Cydeo1990@";

        char[] pass = password.toCharArray();

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;// has upper case
        boolean r3 = false;// has lower case
        boolean r4 = false;// has digit
        boolean r5 = false;// has special char

        for (char each : pass) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);
    }

    public static boolean isStrongPassword(String password){
        char[] pass = password.toCharArray();
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;// has upper case
        boolean r3 = false;// has lower case
        boolean r4 = false;// has digit
        boolean r5 = false;// has special char

        for (char each : pass) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
