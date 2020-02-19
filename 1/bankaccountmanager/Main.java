package bankaccountmanager;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("0 == " + account.getBalance());

        account.deposit(500);
        System.out.println("500 == " + account.getBalance());

        account.deposit(-5000);
        System.out.println("-4500 == " + account.getBalance());

        System.out.println(account.getHistory());
    }
}
