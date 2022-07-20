public class Main {

    public static void main(String[] args) {

        BankAccount martinsBankAccount = new BankAccount();
        martinsBankAccount.setAccountNumber(321242883);
        System.out.println("accountNumber = " + martinsBankAccount.getAccountNumber());
        martinsBankAccount.setBalance(1000);
        System.out.println("balance = " + martinsBankAccount.getBalance() + " HRK");
        martinsBankAccount.setCustomerName("Martin Petracic");
        System.out.println("customerName = " + martinsBankAccount.getCustomerName());
        martinsBankAccount.setEmail("mpetracic@qmail.hr");
        System.out.println("email = " + martinsBankAccount.getEmail());
        martinsBankAccount.setPhoneNumber("+385919058800");
        System.out.println("phoneNumber = " + martinsBankAccount.getPhoneNumber());

        System.out.println();

        martinsBankAccount.depositFunds(250);
        System.out.println("balance = " + martinsBankAccount.getBalance());

        System.out.println();

        martinsBankAccount.withdrawlFunds(350);
        System.out.println("balance = " + martinsBankAccount.getBalance());

        System.out.println();

        martinsBankAccount.withdrawlFunds(2500);
        System.out.println("balance = " + martinsBankAccount.getBalance());
    }
}
