package generalization;

import java.util.ArrayList;
import java.util.List;

public class UseAccount {
    public static void main(String[] args) {
        Account a = new Account();//new CheckingAccount(0);
        a.deposit(1000);
        System.out.println(a);
        boolean success = a.withdraw(1500);
        System.out.println("Withdrawal was " + (success ? "" : "un") + "successful");
        System.out.println(a);

        List<Account> la = new ArrayList<>();
        la.add(new Account());
        la.add(new CheckingAccount(-1000));
    }
}
