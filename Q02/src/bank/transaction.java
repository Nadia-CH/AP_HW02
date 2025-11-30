package bank;

public class transaction {

    public static void deposit(BankAccount account, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit should be greater than/equal to 0.");
            return;
        }
        account.adjustBalance(amount);
    }

    public static void withdraw(BankAccount account, double amount) {
        if (amount <= 0) {
            System.out.println("You cannot withdraw negative amount.");
            return;
        }
        if (account.getBalance() < amount) {
            System.out.println("Not enough $! :(");
            return;
        }
        account.adjustBalance(-amount);
    }

    public static void transfer(BankAccount sender, BankAccount receiver, double amount) {
        if (amount <= 0) {
            System.out.println("You cannot transfer negative amount.");
            return;
        }
        if (sender.getBalance() < amount) {
            System.out.println("Not enough $ in sender's balance.");
            return;
        }
        sender.adjustBalance(-amount);
        receiver.adjustBalance(amount);
    }
}