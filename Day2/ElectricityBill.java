package day2;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Consumar Id: ");
        int id = SC.nextInt();
        System.out.print("Enter Units consumed: ");
        int units = SC.nextInt();
        
   double bill;
   if (units<=100){
    bill = units * 5;
   } else if (units<=200){
    bill = (100 * 5) + (( units -100)*7);
   } else if (units<=300) {
    bill = (100 * 5) + (100 *7)+ (( units -200)*10);
   }
      else {
        bill = (100 * 5) + (100 *7)+ (100 *10)+ (( units -300)*12);
      }

      System.out.println("Electricity Bill for Consumar Id " + id + " is: " + bill);
      SC.close();
    }
}
