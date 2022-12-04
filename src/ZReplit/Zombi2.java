package ZReplit;

import java.util.Arrays;
import java.util.Scanner;

public class Zombi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int [] temp= inhabitants;
        int []empty= new int[inhabitants.length];
        //TODO. Write you code below this line.
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int day=0;
        while (!Arrays.equals(temp,empty)){//[10, 5, 0, 0, 4, 7, 6, 2]

            for (int i = inhabitants.length-2; i >0; i--) {
                if (inhabitants[inhabitants.length-2] == 0) {
                    temp[inhabitants.length-1] = inhabitants[inhabitants.length-1] / 2;
                }
                if(inhabitants[i-1]==0||inhabitants[i+1]==0 ){
                    temp[i]=inhabitants[i]/2;
                }
                if (inhabitants[1] == 0) {
                    temp[0] = inhabitants[0] / 2;
                }
            }
            day++;
            inhabitants = Arrays.copyOf(temp,temp.length);
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        }
    }
}