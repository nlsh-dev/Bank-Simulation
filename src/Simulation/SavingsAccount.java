package Simulation;

public class SavingsAccount extends Account {

    private double minimumBalance;

    public SavingsAccount(
            String accountNumber,
            String accountHolder,
            double initialBalance,
            double minimumBalance) {

        super(accountNumber, accountHolder, initialBalance);
        this.minimumBalance = minimumBalance;
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }

        if (balance - amount < minimumBalance) {
            System.out.println(
                    "Withdrawal denied. Minimum balance of ₹"
                            + minimumBalance
                            + " must be maintained."
            );
            return;
        }

        balance -= amount;

        System.out.println("₹" + amount + " withdrawn successfully.");

    }
}