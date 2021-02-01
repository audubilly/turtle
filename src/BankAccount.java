public class BankAccount {

    private String accountName;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;



    public void withdrawMoney(double amount) {
        if(this.accountBalance -  amount <= 0) {
            System.out.println("insufficient funds");
        }else {
            this.accountBalance -= amount;
        } System.out.println("the  withdrawal amount is " + amount + ". "+ "the balance is " + this.accountBalance);
    }

    public  void depositMoney(double amount){
       this.accountBalance += amount;
        System.out.println("the deposit amount is " + amount + " . "+ "the new account balance is " + this.accountBalance);
    }

    public String getAccountName() {
        return accountName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;


    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }






}
