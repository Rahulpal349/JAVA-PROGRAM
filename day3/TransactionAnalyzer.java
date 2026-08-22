import java.util.Scanner;

public class TransactionAnalyzer {
    static double calculateDeposits(double[] transactions) {
        double total = 0;

        for (double transaction : transactions) {
            if (transaction > 0) {
                total = total + transaction;
            }
        }

        return total;
    }
    static double calculateWithdrawals(double[] transactions) {
        double total = 0;

        for (double transaction : transactions) {
            if (transaction < 0) {
                total = total + (-transaction);
            }
        }

        return total;
    }
    static double findLargestDeposit(double[] transactions) {
        double largest = 0;

        for (double transaction : transactions) {
            if (transaction > largest) {
                largest = transaction;
            }
        }

        return largest;
    }
     static double findLargestWithdrawal(double[] transactions) {
        double largest = 0;

        for (double transaction : transactions) {
            if (transaction < 0 && -transaction > largest) {
                largest = -transaction;
            }
        }

        return largest;
    }
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        double[] transactions = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction " + (i + 1) + ": Rs.");
            transactions[i] = sc.nextDouble();
        }

        double deposits = calculateDeposits(transactions);
        double withdrawals = calculateWithdrawals(transactions);

        double netTransaction = deposits - withdrawals;

        System.out.println("\n===== TRANSACTION REPORT =====");
        System.out.println();

        System.out.println("Total Deposits: Rs." + deposits);
        System.out.println("Total Withdrawals: Rs." + withdrawals);
        System.out.println("Net Transaction: Rs." + netTransaction);
        System.out.println("Largest Deposit: Rs."
                + findLargestDeposit(transactions));
        System.out.println("Largest Withdrawal: Rs."
             + findLargestWithdrawal(transactions));

        sc.close();
    }
}
