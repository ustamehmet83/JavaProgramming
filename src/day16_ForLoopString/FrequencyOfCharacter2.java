package day16_ForLoopString;

import java.util.Scanner;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string and a char; ");
        String str = scan.nextLine();
        char chr = scan.next().charAt(0);
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == chr) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
