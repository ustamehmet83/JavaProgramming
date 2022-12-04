package day35_Encapsulation.Task;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if(size == null){
            System.err.println("Size can not be null");
            System.exit(0);
        }
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equals("large"))) {
            System.err.println("Invalid size :" + size);
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid number of cheese topping :" + numberOfCheeseTopping);
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else {
            System.err.println("Invalid number of cheese topping :" + numberOfCheeseTopping);
            System.exit(0);
        }
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.err.println("Invalid number of cheese topping :" + numberOfPepperoniTopping);
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 4) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 5) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 6) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else {
            System.err.println("Invalid number of cheese topping :" + numberOfPepperoniTopping);
            System.exit(0);
        }
    }

    public int calcCost(){
        if(size.equalsIgnoreCase("small")){
            return 10+2*(numberOfPepperoniTopping+numberOfCheeseTopping);
        }else if(size.equalsIgnoreCase("medium")){
            return 12+2*(numberOfPepperoniTopping+numberOfCheeseTopping);
        }else{
            return 14+2*(numberOfPepperoniTopping+numberOfCheeseTopping);
        }
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost= $" + calcCost() +
                '}';
    }
}