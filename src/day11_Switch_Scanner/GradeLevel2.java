package day11_Switch_Scanner;

public class GradeLevel2 {
    public static void main(String[] args) {
        byte number = 20;

        boolean grade = number>=1 && number <= 18;

        if (grade) {
            switch (number) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Elemantary school");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Middle school");
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("High school");
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    System.out.println("College");
                    break;
                case 17:
                default:
                    System.out.println("Grad school");
                    break;
            }

        } else {
            System.out.println("Invalid grade level given");
        }


    }


}
