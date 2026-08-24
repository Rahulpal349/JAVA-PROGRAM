import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        System.out.print("Enter your Age: ");
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Hello " + age);
        
    }
}