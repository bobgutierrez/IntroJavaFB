package objectexample;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String holder;
    private List<Integer> transactionHistory = new ArrayList<>();

    public Account(String holderName) {
        holder = holderName;
    }

    public void deposit(int amount) {
        transactionHistory.add(amount);
    }

    public void withdraw(int amount) {
        transactionHistory.add(-amount);
    }

    public int getBalance() {
        int balanceSoFar = 0;
        for (int index = 0; index < transactionHistory.size(); index++) {
            balanceSoFar = balanceSoFar + transactionHistory.get(index);
        }
        return balanceSoFar;
    }

    public String toString() {
        return "Account of " + this.holder + " balance is " + this.getBalance();
    }
}
