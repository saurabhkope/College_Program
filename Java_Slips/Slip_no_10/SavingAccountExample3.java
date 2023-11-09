// Q2. Define a class SavingAccount (acno, name, balance). Define appropriate operations as,
// withdraw(), deposit(), and viewbalance(). The minimum balance must be 500. Create an object
// and perform operation. Raise user defined ―InsufficientFundException when balance is not
// sufficient for withdraw operation.


// User-defined exception for insufficient funds
class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        super("Insufficient funds for withdrawal");
    }
}

// SavingAccount class
class SavingAccount {
    private int acno;
    private String name;
    private double balance;
    private final double minBalance = 500; // Minimum balance

    public SavingAccount(int acno, String name, double balance) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < minBalance) {
            throw new InsufficientFundException();
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void viewBalance() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class SavingAccountExample3 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(12345, "saurabh", 1000.0);

        try {
            account.viewBalance();
            account.deposit(500.0);
            account.withdraw(800.0); // This should raise InsufficientFundException
            account.viewBalance();
        } catch (InsufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
