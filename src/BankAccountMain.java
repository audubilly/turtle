public class BankAccountMain {

    BankAccount bankAccount;
    public static void main(String[] args) {

        BankAccount billyAccount = new BankAccount();

        billyAccount.withdrawMoney(200.0);
        billyAccount.depositMoney(233.98);
    }
}
