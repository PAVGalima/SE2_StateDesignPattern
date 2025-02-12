public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(); // Initial state is Active.
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
    // Deposit method.
    public void deposit(Double amount) {
        accountState.deposit(this, amount);
    }
    // Withdraw method.
    public void withdraw(Double amount) {
        accountState.withdraw(this, amount);
    }

    public void suspend() {
        accountState.suspend(this);
    }
    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
