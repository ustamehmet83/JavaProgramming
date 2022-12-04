package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car();
        car1.setInfo("Mercedes","5.20i","Black",2020,15000 );
        System.out.println(car1.toString());
        car1.start();
        car1.drive();
        car1.stop();

        Car car2 = new Car();
        car2.setInfo("BMW","e350","White",2005,20000);
        System.out.println(car2.toString());

        Car car3= new Car();
        car3.setInfo("Audi","A6","Blue",2005,10000);
        System.out.println(car3.toString());

        //Car [] cars={car1,car2,car3};
        ArrayList<Car>carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        for (Car each:carsList) {
            System.out.println(each.brand+" : "+each.price);
        }
        System.out.println("----------------------------------");

        /*
        Recall:
        BMW: 2005 - 2008
        Toyota: 1995 - 1997

         */

        carsList.removeIf(p->p.brand.equals("BMW") && p.year<=2008 && p.year>=2005);
        carsList.removeIf(p->p.brand.equals("Toyota") && p.year<=1997 && p.year>=1995);
        System.out.println(carsList);















    }
}
