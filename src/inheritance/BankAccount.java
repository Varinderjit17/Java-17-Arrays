package inheritance;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String name;

    public BankAccount() {
        this.accountNumber = 12345;
        this.accountBalance = 786;
        this.name= "Default";
    }
    public BankAccount(int accountNumber, double accountBalance, String name) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
    }

    //constructor chaining
    public BankAccount(int accountNumber) {
        this(accountNumber, 0, "user");
    }

    public void depositFunds(double amount) {
        accountBalance +=amount;
        System.out.println("Deposit amount "+ amount + " Your account balance is "+accountBalance);
    }

    public void withdrawFunds(double amount) {
        if(accountBalance - amount < 0) {
            System.out.println("Insufficient amount to be withdrawn");
        } else {
            accountBalance -=amount;
            System.out.println("Withdrawn amount "+ amount + " Your account balance is "+accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
