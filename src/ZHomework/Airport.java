package ZHomework;

import java.util.ArrayList;
import java.util.Arrays;

import static ZHomework.FlightTicket.*;


public class Airport {
    static {
        FlightTicket ticket1= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket2= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket3= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket4= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket5= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket6= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket7= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket8= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket9= new FlightTicket("first","Chicago","Virgina");
        FlightTicket ticket10= new FlightTicket("first","Chicago","Virgina");
        tickets.addAll(Arrays.asList(ticket1,ticket2,ticket3,ticket4,ticket5,ticket6,ticket7,ticket8,ticket9,ticket10));

    }
    public static void main(String[] args) {

        System.out.println(firstType("first"));
        System.out.println(arrivalChicago("Chicago"));
    }






}
