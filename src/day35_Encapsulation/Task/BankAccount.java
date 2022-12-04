package day35_Encapsulation.Task;

public class BankAccount {
    private String accountHolder;//hesap sahibi
    private long accountNumber;//hesap numarası
    private double balance;


    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty() || accountHolder.isBlank()) {
            System.out.println("Invalid account holder :" + accountHolder);
            System.exit(0);
        }
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Invalid account number :" + accountNumber);
            System.exit(0);
        }
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(1);
        }
        System.out.println("Depositing $" + amount + " to the account " + accountNumber);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Withdrawing amount can not be negative or zero");
            System.exit(1);
        }
        if (balance <amount) {
            System.err.println("Insufficient balance");
            System.exit(1);
        }
        System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            System.err.println("Invalid balance");
            System.exit(1);
        }
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
