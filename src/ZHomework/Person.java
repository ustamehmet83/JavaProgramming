package ZHomework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        if(firstName==null){
            firstName = "undefined";
        }else{
            this.firstName=firstName;
        }
        return firstName;
    }

    public String getLastName() {
        if(lastName==null){
            lastName = "undefined";
        }else{
            this.lastName=lastName;
        }
        return lastName;
    }

    public int getAge() {
        if(age==0){
            age = -1;
        }else{
            this.age=age;
        }
        return age;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty() || firstName.isEmpty()) {
            System.out.println("Invalid name");
            System.exit(0);
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Invalid name");
            System.exit(0);
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            System.exit(0);
        }

        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
