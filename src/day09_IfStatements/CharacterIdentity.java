package day09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 65535;
        if (ch >= 0 && ch <= 65535) {
            if (ch <= 57 && ch >= 48) {
                System.out.println(ch + "is a digit");
            } else if (ch <= 90 && ch >= 65 || ch <= 122 && ch >= 97) {
                System.out.println(ch + " is a Alphabetic Character");
            } else {
                System.out.println(ch + " is a special character");
            }
        }else{
                System.out.println(ch + " is invalid");
            }



    }
}