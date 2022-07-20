public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fundsToDeposit) {
        this.balance += fundsToDeposit;
        System.out.println("Funds deposited. You added " + fundsToDeposit + " to your account.");
    }

    public void withdrawlFunds(double fundsToWithdrawl) {
        if (fundsToWithdrawl > this.balance) {
            System.out.println("Insufficient funds. You tried to withdrawl " + fundsToWithdrawl);
        } else {
            this.balance -= fundsToWithdrawl;
            System.out.println("Funds payed. You withdrawled " + fundsToWithdrawl + " from your account.");
        }
    }
}