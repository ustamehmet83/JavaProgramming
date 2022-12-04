package day31_Constructors.Tasks;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder() {
        System.out.println("chef's " + name + "is making an order");
    }

    public void washDishes() {
        System.out.println("chef's " + name + "is washing the dishes");
    }

    public String FullTime() {
        String isFullTime="part-time";
        if (fullTime){
            isFullTime="full-time";
        }
        return isFullTime;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime status=" + FullTime() +
                '}';
    }
}
