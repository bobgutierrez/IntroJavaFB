package generalization;

public class CheckingAccount extends Account {
    protected long overdraftLimit;

    public CheckingAccount(long overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(long amount) {
        long expectedBalance = balance - amount;
        if (expectedBalance >= overdraftLimit) {
            balance = expectedBalance;
            return true;
        } else {
            return false;
        }
    }
}
