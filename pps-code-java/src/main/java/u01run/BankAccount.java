package u01run;

public interface BankAccount {
    int balance();

    void deposit(int amount);

    void withdraw(int amount);
}
