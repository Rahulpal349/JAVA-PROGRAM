public class BankAccount {

    // Private fields - Encapsulation
    private String accountNumber;
    private String holderName;
    private double balance;

    // Static field - shared by all objects
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        totalAccounts++;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs." + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        }
    }

    // Transfer
    public void transfer(BankAccount receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");

        } else if (amount > balance) {
            System.out.println("Transfer failed: Insufficient balance.");

        } else {
            balance -= amount;
            receiver.balance += amount;

            System.out.println(
                "Rs." + amount + " transferred from "
                + holderName + " to " + receiver.holderName
            );
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Display account
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs." + balance);
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }


    // Main method
    public static void main(String[] args) {

        BankAccount account1 =
            new BankAccount("ACC001", "Rahul", 10000);

        BankAccount account2 =
            new BankAccount("ACC002", "Amit", 5000);

        // Rahul deposits ₹5,000
        account1.deposit(5000);

        // Rahul withdraws ₹2,000
        account1.withdraw(2000);

        // Rahul transfers ₹3,000 to Amit
        account1.transfer(account2, 3000);

        System.out.println("\n===== ACCOUNT 1 =====");
        account1.displayAccount();

        System.out.println("\n===== ACCOUNT 2 =====");
        account2.displayAccount();

        System.out.println("\nTotal Accounts: "
                + BankAccount.getTotalAccounts());
    }
}