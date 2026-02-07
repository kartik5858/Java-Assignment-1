import java.util.Scanner;
class PowerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = n > 0 && (n & (n - 1)) == 0;
        System.out.println(res);
        sc.close();
    }
}

