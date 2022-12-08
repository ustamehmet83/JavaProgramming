package ZHomework;

import java.util.ArrayList;

public class FlightTicket {
    private String type;
    private String departure;
    private String arrival;
    static ArrayList<FlightTicket> tickets;


    static {
        tickets=new ArrayList<>();
    }
    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        setDeparture(departure);
        setArrival(arrival);
    }

    public String getType() {
        return type;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setType(String type) {
        if(!(type.equals("first")||type.equals("business")||type.equals("economy"))){
            System.out.println("invalid type of class");
            return;
        }
        this.type = type;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public static ArrayList firstType(String type){
        ArrayList<FlightTicket>ticketFirst=new ArrayList<>();
        for (FlightTicket each:tickets) {
            if(each.type.equals(type)){
                ticketFirst.add(each);
            }
        }
        return ticketFirst;
    }
    public static ArrayList arrivalChicago(String departure){
        ArrayList<FlightTicket>ticketFirst=new ArrayList<>();
        for (FlightTicket each:tickets) {
            if(each.departure.equals(departure)){
                ticketFirst.add(each);
            }
        }
        return ticketFirst;
    }
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
