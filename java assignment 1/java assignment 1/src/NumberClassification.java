import java.util.Scanner;
class NumberClassification{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();

        if(num1 > 0){
            System.out.println("It is a positive number");
        }else if(num1 < 0){
            System.out.println("It is a negative number");
        }
        if(num1%2 == 0){
            System.out.println("It is an even number");
        }else
            System.out.println("It is a odd number");
        if(num1%5 == 0 && num1%7 == 0){
            System.out.println("It is divisible by both 5 and 7");
        }else
            System.out.println("It is not divisible by both 5 and 7 ");
        sc.close();
    }

}
