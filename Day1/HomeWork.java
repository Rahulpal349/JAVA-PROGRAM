package Day1;
import java.util.Scanner;

public class HomeWork {
    public static void main(String [] args) {
        
   // int Principal =10000;
   // int Rate = 5;
   // int Time = 3;
   // int SimpleInterest = (Principal * Rate * Time) / 100;
   // System.out.println("Simple Interest is: " + SimpleInterest); 



     /*    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close(); */


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
    
