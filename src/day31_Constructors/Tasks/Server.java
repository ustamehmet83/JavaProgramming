package day31_Constructors.Tasks;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println("server's " + name + "is taking an order");
    }

    public void cleanTable() {
        System.out.println("server's " + name + "is cleaning the table");
    }
    public String isFullTime(){
        String isFullTime="part-time";
        if (fullTime){
            isFullTime="full-time";
        }
        return isFullTime;
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime status= " + isFullTime() +
                '}';
    }
}
