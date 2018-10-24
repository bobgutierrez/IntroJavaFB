package funstuff;

import java.util.Scanner;

public class PasswordLockout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;
        int attemptsRemaining = 3;

        // come back and retry...
        while (success == false && attemptsRemaining > 0) {
            System.out.print("Enter Password: ");
            String pw = sc.nextLine();
            attemptsRemaining = attemptsRemaining - 1;

            if (pw.equals("Obvious")) {
                System.out.println("Welcome!");
                success = true;
            } else {
                System.out.println("Bad!!!!");
                // Must aready be false! success = false;
                assert (success == false) : "success should aready be false";
            }

        }

        System.out.println("At the end...");
    }
}
