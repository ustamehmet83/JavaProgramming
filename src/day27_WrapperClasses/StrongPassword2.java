package day27_WrapperClasses;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialChar++;
            }
        }
        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigits = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;
        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase
                && hasLowerCase && hasDigits && hasSpecialChar;
        System.out.println("strongPassword = " + strongPassword);
    }


}
