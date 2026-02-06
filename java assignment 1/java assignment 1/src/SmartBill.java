import java.util.Scanner;
class SmartBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many apples do you want?");
        int quantity = sc.nextInt();
        System.out.println("At what price do you want to buy Apples?");
        double price = sc.nextDouble();
        double total = price*quantity;
        if(total >= 5000){
            total = total*0.9;
        }else if(total >=2000){
            total = total*0.95;
        }
        total = total + (total*0.18);
        System.out.println("Your total would be : "+total);
    }
}