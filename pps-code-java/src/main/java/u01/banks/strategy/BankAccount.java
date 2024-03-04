package u01.banks.strategy;

public interface BankAccount {

    int balance();

    void deposit(int amount);

    void withdraw(int amount);

}