package day13_String;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
            System.out.println("Select screen size:");
            Scanner scan = new Scanner(System.in);
            double screenSize = scan.nextDouble();

            System.out.println("Select CPU type:");
            String cpuType = scan.next();
            double finalPrice = 0;
            if (screenSize == 13.3) {
                finalPrice += 200;
            }
            if (screenSize == 15.0) {
                finalPrice += 300;
            }
            if (screenSize == 17.3) {
                finalPrice += 400;
            }
            if (cpuType.equals("i3")) {
                finalPrice += 150;//userinput.equals("admin")
            }
            if (cpuType.equals("i5")) {
                finalPrice += 250;
            }
            if (cpuType.equals("i7")) {
                finalPrice += 350;
            }

            System.out.println("Select RAM size:");
            int ramSize = scan.nextInt();
            finalPrice += (ramSize / 4 * 50);

            System.out.println("Select storage type:");

            String storageType = scan.next();
            System.out.println("Select storage size:");

            int storageSize = scan.nextInt();

            if (storageType.equals("HDD")) {
                finalPrice += (storageSize / 500 * 50);
            }
            if (storageType.equals("SSD")) {
                finalPrice += (storageSize / 500 * 100);
            }
            System.out.println("Select screen resolution:");
            String screenResolution = scan.next();
            if (screenResolution.equals("FULLHD")) {
                finalPrice += 100;
            }
            if (screenResolution.equals("4K")) {
                finalPrice += 200;
            }

            System.out.println("Final price is: $" + finalPrice);


        }

    }

