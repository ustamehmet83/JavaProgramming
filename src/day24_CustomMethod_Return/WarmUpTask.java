package day24_CustomMethod_Return;

public class WarmUpTask {
    public static void main(String[] args) {
        initials("mehmet", "usta");
        domain("usta.mehmet83@hotmail.com");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        //domain(emails[0]);
        for (String email : emails) {
            domain(email);
        }
        nameOfMonth(8);
        nameOfDay(15);
    }

    public static void initials(String firstName, String secondName) {

        String initial = (firstName.charAt(0) + "." + secondName.charAt(0)).toUpperCase();
        System.out.println("initial = " + initial);
    }

    public static void domain(String email) {//ustamehmet83@hotmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfMonth(int number) {
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid");

        }

    }

    public static void nameOfDay(int number){
        String day="";
        if (number>=0 && number<=7){
            day=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday"
            :(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Friday";
        }else {
            System.out.println("invalid");
        }
        System.out.println(day);
    }


}

