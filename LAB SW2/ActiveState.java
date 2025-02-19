public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + " to Account " + account.getAccountNumber());
        System.out.println(account.toString());
    }
    @Override
    public void withdraw(Account account, Double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew " + amount + " from Account " + account.getAccountNumber());
            System.out.println(account.toString());
        } else {
            System.out.println("Insufficient funds to withdraw " + amount);
        }
    }
    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}