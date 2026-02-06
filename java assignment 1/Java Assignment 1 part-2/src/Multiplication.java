import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        boolean neg = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);

        while (b > 0) {
            if ((b & 1) == 1)
                result += a;

            a <<= 1;
            b >>= 1;
        }
        if (neg)
            result = -result;
        System.out.println(result);
    }
}

