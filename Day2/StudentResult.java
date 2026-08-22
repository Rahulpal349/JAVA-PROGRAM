package day2;
import java.util.Scanner;

public class StudentResult{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

     System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        
        System.out.print("Enter Marks in Java: ");
        int javaMarks = sc.nextInt();
        
        System.out.print("Enter Marks in Database: ");
        int databaseMarks = sc.nextInt();
        
        System.out.print("Enter Marks in Mathematics: ");
        int mathMarks = sc.nextInt();
        
        float total = javaMarks + databaseMarks + mathMarks;
        float avg= (total)/3;

        String grade;
        if(avg>=90){
            grade ="A";
        } else if (avg>=75){
            grade ="B";
        } else if (avg>=60){
            grade ="C";
        } else if (avg>=40){
            grade ="D";
        } else {
            grade ="Fail";
        }
            System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNumber);
        System.out.println("Java: " + javaMarks);
        System.out.println("Database: " + databaseMarks);
        System.out.println("Mathematics: " + mathMarks);
        System.out.println("Total: " + total);
        System.out.println("Avarage Marks: " +avg);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
