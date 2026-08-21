package oops;

public class ProblemsinBankingSysDriver {

    public static void main(String[] args) {

    	ProblemsinBankingSys account1 = new ProblemsinBankingSys(" Rahul ", 5000);
    	ProblemsinBankingSys account2 = new ProblemsinBankingSys("Aman", 8000);
        ProblemsinBankingSys account3 = new ProblemsinBankingSys("Priya", 12000);

        account1.deposit(2000);
        account1.withdraw(1500);

        account2.withdraw(9000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        System.out.println("Total Accounts : " + ProblemsinBankingSys.getTotalAccounts());
    }
}
// ProblemsinBankingSysDriver

/*  // Display account details
public void displayAccountDetails() {
System.out.println("----------------------------");
System.out.println("Account Number : " + accountNumber);
System.out.println("Account Holder : " + accountHolderName);
System.out.println("Balance        : ₹" + balance);
System.out.println("----------------------------");
}*/