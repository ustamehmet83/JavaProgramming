package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'g';

        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'd':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");
                break;


        }


    }
}
