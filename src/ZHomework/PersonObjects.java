package ZHomework;

public class PersonObjects {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString());

        Person person2 = new Person("Fatima", "Lee", 22);

        System.out.println(person2.getFirstName()); //"Fatima"
        System.out.println(person2.getLastName()); //"Lee"
        System.out.println(person2.getAge()); // 22
        System.out.println(person2.toString()); //"Fatima | Lee | 22"

    }
}
