package day35_Encapsulation.Task;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount("Mehmet Usta",221134,1000);

        bankAccount1.deposit(100);
        bankAccount1.withdraw(500);
        System.out.println(bankAccount1);



    }
}
