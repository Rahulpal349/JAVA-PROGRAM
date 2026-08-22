package day2;
import java.util.Scanner;
public class Loginpage {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "java123";

        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }

        sc.close();
    }
}
