package day35_Encapsulation.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy>candies=new ArrayList<>();
        Candy candy1= new Candy("Candy",5,10,true);
        Candy candy2= new Candy("tutti",6,5,false);
        Candy candy3= new Candy("tofita",7,15,false);
        Candy candy4= new Candy("bonibo",10,18,false);
        Candy candy5= new Candy("ülker",17,20,true);
        Candy candy6= new Candy("ülker",17,3,true);

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy each:candies) {
            System.out.println(each.getBrand());
        }
        System.out.println(candy6);






    }
}
