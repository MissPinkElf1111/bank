public class Main {
    public static void main(String[] args){
        Authenticator authenticator = new Authenticator();
        authenticator.authentication();

        Balance balance = new Balance();
        balance.setBalance(2000.19);
        balance.view();
        balance.withdraw();
        balance.deposit();
    }
}
