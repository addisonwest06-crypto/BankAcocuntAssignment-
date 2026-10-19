
public class CheckingAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    // Set interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Get interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {

        if (amount > getBalance()) {
            withdrawal(amount);
            withdrawal(30.00);

            System.out.println("Overdraft fee assessed: $30.00");
            System.out.printf("Negative Balance: $%.2f%n",
                    getBalance());
        } else {
            withdrawal(amount);
            System.out.println("Withdrawal successful.");
            System.out.printf("Current Balance: $%.2f%n",
                    getBalance());
        }
    }

    // Display all account information
    public void displayAccount() {
        System.out.println("\n--- Checking Account ---");

        accountSummary();

        System.out.println("Interest Rate: "
                + interestRate + "%");
    }
}

