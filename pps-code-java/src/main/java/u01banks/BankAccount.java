package u01banks;

public interface BankAccount {
    int getBalance();

    void deposit(int amount);

    void withdraw(int amount);
}
