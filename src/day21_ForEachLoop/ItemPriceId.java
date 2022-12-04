package day21_ForEachLoop;

import java.util.Arrays;

public class ItemPriceId {
    public static void main(String[] args) {
        String [] items={"Shoes","Jacket","Gloves","Airpods","iPad","iPhone 12 case"};
        double [] prices={99.99, 150.0,9.99, 250.0, 439.50,39.99};
        int [] itemIDs={12345,12346,12347,12348,12349,12350};

        int count=0;
        for (String each:items) {
            count++;
            if(each.equals("Gloves")){
                break;
            }


        }
        System.out.println("index number of \"Gloves\" is = "+count);

        System.out.println("-------------------------------------");

        for (String each :items) {
            if(each.equals("iPad")){
                System.out.println("item contains \"iPad\"");
            }
        }

        System.out.println("--------------------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "-" + prices[i] + "-" + "#" + itemIDs[i]);
        }












    }
}
