import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = 0, sum = 0, count = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            sum += digit;
            count++;
            num = num / 10;
        }
        System.out.println("Reverse: " + rev);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count: " + count);
    }
}
