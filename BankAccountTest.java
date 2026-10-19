
public class BankAccountTest {

    public static void main(String[] args) {

        // Test 1: Create a checking account
        CheckingAccount account = new CheckingAccount();

        account.setFirstName("John");
        account.setLastName("Smith");
        account.setAccountID(1001);
        account.setInterestRate(2.5);

        System.out.println("TEST 1: NEW ACCOUNT");
        account.displayAccount();

        // Test 2: Deposit money
        System.out.println("\nTEST 2: DEPOSIT");

        account.deposit(500.00);

        System.out.printf("Balance after deposit: $%.2f%n",
                account.getBalance());

        // Test 3: Normal withdrawal
        System.out.println("\nTEST 3: NORMAL WITHDRAWAL");

        account.processWithdrawal(200.00);

        // Test 4: Overdraft withdrawal
        System.out.println("\nTEST 4: OVERDRAFT");

        account.processWithdrawal(400.00);

        // Test 5: Final account information
        System.out.println("\nTEST 5: FINAL ACCOUNT");
        account.displayAccount();

        // Test 6: Separate BankAccount object
        System.out.println("\nTEST 6: BANK ACCOUNT");

        BankAccount savings = new BankAccount();

        savings.setFirstName("Jane");
        savings.setLastName("Doe");
        savings.setAccountID(2002);

        savings.deposit(1000.00);
        savings.withdrawal(250.00);

        savings.accountSummary();

        // Test 7: Exact balance withdrawal
        System.out.println("\nTEST 7: EXACT BALANCE");

        CheckingAccount testAccount = new CheckingAccount();

        testAccount.deposit(100.00);
        testAccount.processWithdrawal(100.00);

        // Test 8: Overdraft from zero
        System.out.println("\nTEST 8: OVERDRAFT FROM ZERO");

        CheckingAccount zeroAccount = new CheckingAccount();

        zeroAccount.processWithdrawal(50.00);

    }
}