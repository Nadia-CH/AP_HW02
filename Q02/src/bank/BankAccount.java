package bank;



public class BankAccount {

    private String accountHolderName;
    private double balance;
    private String cardNumber;

    public BankAccount(String accountHolderName, double balance, String cardNumber) {
        if (balance < 0) {
            System.out.println("Initial balance cannot be negative");
            balance = 0;
        }

        if (cardNumber == null || cardNumber.length() != 16) {
            System.out.println("CreditCard Number shall have 16 digits!");
        }

        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void adjustBalance(double amount) {
        if (balance + amount < 0) {
            System.out.println("Not enough $! :(");
            return;
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return " Name: " + accountHolderName +
                " cardNum: " + cardNumber +
                " balance: " + balance;
    }
}