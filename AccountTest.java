public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account("1234", 10000.0); // Active State
        myAccount.activate(); 

        myAccount.suspend(); 

        myAccount.activate(); 

        // Deposit to the account
        myAccount.deposit(1000.0); 

        // Withdraw from the account
        myAccount.withdraw(100.0); 

        // Close the account
        myAccount.close(); 

        // Try to activate a closed account
        myAccount.activate(); 

        myAccount.suspend(); 
        myAccount.withdraw(500.0); 
        myAccount.deposit(1000.0); 
    }
}
