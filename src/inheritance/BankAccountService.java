package inheritance;

public class BankAccountService {
    public static void bankAccountService() {
        BankAccount rupiAccount = new BankAccount();
        rupiAccount.depositFunds(3000);
        rupiAccount.withdrawFunds(100);

        BankAccount user1 = new BankAccount();
        user1.depositFunds(100);

        BankAccount user2 = new BankAccount(12345);
        user2.depositFunds(100);
    }
}
