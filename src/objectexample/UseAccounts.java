package objectexample;

public class UseAccounts {
    public static void main(String[] args) {
        Account myAccount = new Account("Simon");
        myAccount.deposit(1000);
        System.out.println(myAccount/*.toString()*/);
        myAccount.withdraw(50);
        System.out.println("After one deposit and one withdrawal: " + myAccount);
        myAccount.withdraw(100);
        System.out.println(myAccount);
        myAccount.deposit(200);
        System.out.println(myAccount);
    }
}
