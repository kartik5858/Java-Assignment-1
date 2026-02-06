import java.util.Scanner;
class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int q = 0;
        int sign = (a < 0) ^ (b < 0) ? -1 : 1;

        a = Math.abs(a);
        b = Math.abs(b);

        while (a >= b) {
            a -= b;
            q++;
        }
        System.out.println(sign * q);
    }
}
