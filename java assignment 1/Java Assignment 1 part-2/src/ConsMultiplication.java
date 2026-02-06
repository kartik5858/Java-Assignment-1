import java.util.Scanner;
class ConsMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = (x << 3) - x;
        System.out.println(result);
    }
}

