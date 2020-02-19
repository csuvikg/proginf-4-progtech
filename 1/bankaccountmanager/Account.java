package bankaccountmanager;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private final List<Integer> history;

    public Account() {
        history = new ArrayList<>();
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public List<Integer> getHistory() {
        return history;
    }

    public void deposit(int amount) {
        this.balance += amount;
        history.add(balance);
    }
}
