public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Aditya Bajpai", "11111111", 1000);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500.00);
        System.out.println("After Deposit: " + account.getBalance());

        account.withdraw(200.00);
        System.out.println("After Withdrawal: " + account.getBalance());
    }
}