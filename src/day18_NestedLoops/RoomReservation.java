package day18_NestedLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;



        while (true) {

            System.out.println("Which bedroom do you want to reserve? ");
            String room = scan.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Which bedroom do you want to reserve? ");
                room = scan.nextLine().toLowerCase();
            }

            System.out.println("How many nights do you stay?");
            int day = scan.nextInt();

            if (room.equals("king bed")) {
                totalPrice += (day * 120);

            } else if (room.equals("queen bed")) {
                totalPrice += (day * 100);
            } else {
                totalPrice += (day * 80);
            }
            System.out.println("Would you like to reverse another room?");
            String answer = scan.next().toLowerCase();



            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Would you like to reverse another room?");
                answer = scan.next().toLowerCase();

            }
            if (answer.equals("yes")) {
                scan.nextLine();
            }
            if (answer.equals("no")) {
                System.out.println(totalPrice);
                break;
            }
        }


    }
}
