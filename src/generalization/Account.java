package generalization;

public class Account {
    protected long balance;
    public void deposit(long amount) {
        balance = balance + amount;
    }


    public boolean withdraw(long amount) {
        balance = balance - amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
