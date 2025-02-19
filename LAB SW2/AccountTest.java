public class AccountTest {
    public static void main(String[] args) {

        System.out.println();
        Account myAccount = new Account("1234", 10000.0); // Active State
        myAccount.activate(); 
        System.out.println();
        myAccount.suspend(); 

        myAccount.activate(); 
        System.out.println();
        // Deposit to the account
        myAccount.deposit(1000.0); 

        // Withdraw from the account
        myAccount.withdraw(100.0); 

        // Close the account
        myAccount.close(); 
        System.out.println();
        // Try to activate a closed account
        myAccount.activate(); 

        myAccount.suspend(); 
        myAccount.withdraw(500.0); 
        myAccount.deposit(1000.0); 
        System.out.println();
    }
}
