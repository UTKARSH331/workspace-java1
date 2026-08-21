package oops;

public class ProblemsinBankingSys {

    // Shared by all accounts
    private static int nextAccountNumber = 100001;
    private static int totalAccounts = 0;

    // Unique for each account
    private final int accountNumber;

    private String accountHolderName;
    private int balance;

    // Constructor
    public ProblemsinBankingSys(String accountHolderName, int balance) {

        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.accountHolderName = accountHolderName;
        this.balance = balance;

        // Automatically assign account number
        this.accountNumber = nextAccountNumber++;

        // Count total accounts
        totalAccounts++;
    }

    // Deposit money
    public void deposit(int amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Withdraw money
    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    // Check balance
    public int checkBalance() {
        return balance;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Change account holder name
    public void setAccountHolderName(String accountHolderName) {

        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            System.out.println("Account holder name cannot be empty.");
            return;
        }

        this.accountHolderName = accountHolderName;
    }

    // Total accounts created
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("----------------------------");
    }
}

//ProblemsinBankingSys