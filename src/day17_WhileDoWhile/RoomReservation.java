package day17_WhileDoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?(yes/no)");
        String reverse = scan.next().toLowerCase();
        while (!(reverse.equals("yes") || reverse.equals("no"))) {
            System.out.println("Invalid answer.Please re-enter");
            reverse = scan.next().toLowerCase();
        }
        scan.nextLine();
        if (reverse.equals("yes")) {
            System.out.println("Select a room: ");
            String selectRoom = scan.nextLine();
            while (!(selectRoom.equalsIgnoreCase("King bed") || selectRoom.equalsIgnoreCase("Queen Bed") ||
                    selectRoom.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Select a room: ");
                selectRoom = scan.nextLine();
            }
            if(selectRoom.equalsIgnoreCase("King bed")){

                System.out.println("King bed : 120$");
            } else if (selectRoom.equalsIgnoreCase("Queen Bed")) {
                System.out.println("Queen Bed : 100$");
            }else{
                System.out.println("Single Bed : 80$");
            }


        }else{
            System.out.println("have a nice day");
        }


    }


}
