package day31_Constructors.Tasks;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Mehmet", "Va", 5);

        Server server1=new Server("Mehmet",145,40,true);
        Server server2=new Server("Mehmet",146,40,true);
        Server server3=new Server("Mehmet",146,40,true);

        Server [] servers={server1,server2,server3};
        restaurant1.hireServer(servers);

        Chef chef1= new Chef("Ahmet",145,40,true);
        Chef chef2= new Chef("Ahmet",143,40,true);
        Chef chef3= new Chef("Ahmet",144,40,true);

        Chef [] chefs={chef1,chef2,chef3};
        restaurant1.hireChef(chefs);



        restaurant1.terminateServer(145);
        System.out.println(restaurant1);
    }
}
