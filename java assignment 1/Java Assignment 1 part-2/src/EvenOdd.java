import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 1;
        if ((n & mask) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
