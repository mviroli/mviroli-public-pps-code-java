package u01.banks.proxy;

public interface BankAccount {

    int balance();

    void deposit(int amount);

    void withdraw(int amount);

}