package day2;
import java.util.Scanner;
public class Loops{
    public static void main(String[] agrs){

    Scanner sc = new Scanner(System.in);

        System.out.print("Enter your balance: ");
        int balance = sc.nextInt();
if (balance > 10000) {
    System.out.println("Premium Account");
} else if (balance >= 5000) {
    System.out.println("Standard Account");
} else {
    System.out.println("Basic Account");
}
    }
}