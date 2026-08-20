package Day1;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs.");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated Balance: Rs." + balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than 0.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount! Withdrawal must be greater than 0.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Updated Balance: Rs." + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
    }
}
    
