package day05_Concantenation;

public class Fullname {
    public static void main(String[] args) {

        String firstName = "Mehmet";
        String lastName = "Usta";
        int age = 39;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100_000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old");
        System.out.print(fullName + " is " + jobTitle + " ,works at " + companyName);
        System.out.println(", and " + fullName + " 's salary is $" + salary);

    }
}
