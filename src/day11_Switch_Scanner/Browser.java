package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "opera";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge") {
            if (browserName == "chrome") {
                System.out.println("Chrome Browser is selected");
            } else if (browserName == "firefox") {
                System.out.println("Firefox Browser is selected");
            } else if (browserName == "opera") {
                System.out.println("Opera Browser is selected");
            } else if (browserName == "safari") {
                System.out.println("Safari Browser is selected");
            } else {
                System.out.println("Edge Browser is selected");
            }

        } else {
            System.out.println("Invalid Browser Name");
        }


    }


}
