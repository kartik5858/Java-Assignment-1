import java.util.Scanner;
class AtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount % 100 == 0 && balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("Withdrawal failed");
        }
    }
}
