public interface AccountState {
    void deposit(Account account, Double amount);
    void withdraw(Account account, Double amount);
    void suspend(Account account);
    void activate(Account account);
    void close(Account account);
}
