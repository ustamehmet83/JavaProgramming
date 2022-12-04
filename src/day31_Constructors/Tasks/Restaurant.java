package day31_Constructors.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server>Servers;
    public ArrayList<Chef>Chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        Servers = new ArrayList<>();
        Chefs = new ArrayList<>();
    }

    public void hireServer(Server server){
        Servers.add(server);
    }
    public void hireServer(Server [] servers){
        Servers.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        Chefs.add(chef);
    }
    public void hireChef(Chef [] chefs ){
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef( int employeeID){
        Chefs.removeIf(p->p.employeeID==employeeID);
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of Servers=" + Servers.size() +
                ", number of Chefs=" + Chefs.size()+
                '}';
    }
}
