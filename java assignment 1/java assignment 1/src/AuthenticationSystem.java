import java.util.Scanner;

class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        int attempts = 3;
        while (attempts > 0) {

            System.out.print("Enter username: ");
            String u = sc.next();

            System.out.print("Enter password: ");
            String p = sc.next();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login successful");
                break;
            }
            else {
                attempts--;
                System.out.println("Wrong credentials. Attempts left: " + attempts);
            }
            if (attempts == 0) {
                System.out.println("Account locked");
            }
        }
    }
}
