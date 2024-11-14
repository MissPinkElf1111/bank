import java.util.Scanner;

public class Authenticator {
    public static void authentication(){
        Scanner login = new Scanner(System.in);

        String user_a = "1234567";
        String user_p = "qwerty";
        Boolean gate = true;

        do {
            System.out.println("Please input your account.");
            String account = login.nextLine();
            System.out.println("Please input the password.");
            String password = login.nextLine();

            if(account.equals(user_a) && password.equals(user_p)){
                System.out.println("Login Successfully!");
                gate = false;
            }
            else{
                System.out.println("Try again");
            }
        } while (gate);
    }

    public static void main(String[] args){
        authentication();
    }
}
