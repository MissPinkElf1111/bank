import java.util.Scanner;

public class Balance {
     public static double balance;
    static Scanner keyboard = new Scanner(System.in);

    public static void setBalance(double money){
        balance = money;
    }

    public static void view(){
        System.out.printf("You current balance is $%.2f\n", balance);
    }

    public static void deposit(){
        System.out.println("How much is your deposit?");
        double amount = keyboard.nextDouble();
        balance += amount;
        System.out.print("Deposit Approved!");
        view();
    }

    public static void withdraw(){
        System.out.println("How much is your withdraw?");
        double amount = keyboard.nextDouble();
        while (amount > balance){
            System.out.println("It is too much, try again");
            System.out.println("How much is your withdraw?");
            amount = keyboard.nextDouble();
        }
        balance -= amount;
        System.out.print("Withdraw Approved!");
        view();
    }

    public static void main(String[] args){
        setBalance(1000);
        view();
        deposit();
        withdraw();
        view();
    }
}
