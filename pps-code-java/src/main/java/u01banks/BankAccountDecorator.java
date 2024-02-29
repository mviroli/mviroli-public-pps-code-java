package u01banks;

public class BankAccountDecorator implements BankAccount {
    protected final BankAccount coreAccount;

    public BankAccountDecorator(final BankAccount coreAccount) {
        this.coreAccount = coreAccount;
    }

    @Override
    public int getBalance() {
        return coreAccount.getBalance();
    }

    @Override
    public void deposit(final int amount) {
        coreAccount.deposit(amount);
    }

    @Override
    public void withdraw(final int amount) {
        coreAccount.withdraw(amount);
    }
}
