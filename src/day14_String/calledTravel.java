package day14_String;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport?(yes or no)");
        String isHavePass = scan.next();
        scan.nextLine();
        System.out.println("Which county do you plan to travel?");
        String $countryName = scan.nextLine();
        int $costAmount = 1000;
        int renewal=200;

        byte $numberOfBags = 0;
        short numberYouTravelWith = 0;
        if (isHavePass.equalsIgnoreCase("yes")) {
            System.out.println("How many bags will you take with?");
            $numberOfBags = scan.nextByte();
            $costAmount += $numberOfBags * 50;

            System.out.println("How many people will you travel with?");
           numberYouTravelWith = scan.nextShort();
            scan.nextLine();
            int reducedOfCost = numberYouTravelWith * 100;
            if (reducedOfCost < 300) {
                $costAmount-= reducedOfCost;
            } else {
                $costAmount -= 300;
            }
            if ($costAmount<1000){
                $costAmount=1000;
            }
            System.out.println("Enter the name of people will you travel with?");
            String $peopleYouTravelWith = scan.nextLine();
            System.out.println("Your ticket is booked to " + $countryName + ". We have charged extra for the " + $numberOfBags + " bags\n" +
                    "but you are traveling with " + $peopleYouTravelWith + " so we are giving a discount.Your total cost is " + $costAmount);

        } else {

            $costAmount+=renewal;
            System.out.println("when your passport expired");
            int $years= scan.nextInt();
            $costAmount+=(2022-$years)*75;
            System.out.println("will be traveling in the next year (yes or no)");
            String travelNextYear=scan.next();
            if(travelNextYear.equalsIgnoreCase("yes")){
                $costAmount+=100;
            }else{
                $costAmount-=50;
            }

            System.out.println("Looks like your password has been expired for "+$years+",\n" +
                    "but not to worry we will get it ready for you to travel to "+$countryName+". \n" +
                    "Your total cost has come out to "+$costAmount+".");

        }




    }
}