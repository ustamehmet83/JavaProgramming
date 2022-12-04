package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {

        if ((size != 'S' && size != 'M' && size != 'L') ||(numberOfCheeseTopping<0&&numberOfCheeseTopping<0) ){
            System.out.println("Invalid data");
            System.exit(0);
        }
        double cost = 0;
        double price = 2;

        if (size == 'S') {
            cost += 10;
        } else if (size == 'M') {
            cost += 12;

        } else {
            cost += 14;
        }

        cost += numberOfCheeseTopping * price;
        cost += numberOfPepperoniTopping * price;
        return cost;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Cost = $" + calcCost() +
                '}';
    }



}
