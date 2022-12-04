package day15_ForLoop;

public class ChangeCh {
    public static void main(String[] args) {
        /*5. write a program that can retive the digits, letters and special
    characters from a string
    Ex:
    input:

    output:
    letters: mnAb
    digits: 123
    special chars: @#!

         */
        String name = "mn@#123Ab!";
        String name2 = "";
        String name3=" ";
        for (char i = '0'; i < '9'; i++) {
            name2 = name.replace(i, ' ');
            name = name2;
        }
        for (char i = 'a'; i < 'z'; i++) {
            name2 = name.replace(i, ' ');
            name = name2;
        }
        for (char i = 'A'; i < 'Z'; i++) {
            name2 = name.replace(i, ' ');
            name = name2;
        }
        for (char i = '0'; i < '9'; i++) {
            name3 = name.replace(i, ' ');
            name = name3;
        }


        System.out.println("special chars = "+name2.replace(" ",""));







    }
}
