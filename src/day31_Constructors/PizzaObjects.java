package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();


        Pizza pizza1 = new Pizza('S', 2, 3);

        for (int i = 0; i < 100; i++) {
            Pizza small = new Pizza('S', 2, 3);
            Pizza medium = new Pizza('M', 3, 4);
            Pizza large = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(small, medium, large));

        }
        System.out.println(pizzas.size());
        double totalPrice= 0;
        for (Pizza pizza:pizzas) {
            totalPrice+=pizza.calcCost();

        }
        System.out.println(totalPrice);
        System.out.println(pizza1);


    }
}
