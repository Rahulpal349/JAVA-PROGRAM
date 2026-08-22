public class BankAccount1 {

    // Properties
    String accountNumber;
    String holderName;
    double balance;

    // Constructor
    BankAccount1(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Rs." + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        }
    }

    // Transfer money
    void transfer(BankAccount1 receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");

        } else if (amount > balance) {
            System.out.println("Transfer failed: Insufficient balance.");

        } else {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println(
                "Rs." + amount + " transferred from "
                + holderName + " to " + receiver.holderName
            );
        }
    }

    // Display account details
    void displayAccount() {
        System.out.println("Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {

        // Create two account objects
        BankAccount1 account1 =
            new BankAccount1("ACC001", "Rahul", 10000);

        BankAccount1 account2 =
            new BankAccount1("ACC002", "Amit", 5000);

        // Rahul deposits ₹5,000
        account1.deposit(5000);

        // Rahul withdraws ₹2,000
        account1.withdraw(2000);

        // Rahul transfers ₹3,000 to Amit
        account1.transfer(account2, 3000);

        // Display Account 1
        System.out.println("\n===== ACCOUNT 1 =====");
        account1.displayAccount();

        // Display Account 2
        System.out.println("\n===== ACCOUNT 2 =====");
        account2.displayAccount();
    }
}