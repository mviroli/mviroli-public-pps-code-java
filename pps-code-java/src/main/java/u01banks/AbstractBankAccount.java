package u01banks;

public abstract class AbstractBankAccount implements BankAccount {
    protected int balance = 0;

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int amount) {
        this.checkNegativeValue(amount);
        this.balance = this.balance + amount;
    }

    protected void checkNegativeValue(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }

    public void withdraw(final int amount) {
        this.checkNegativeValue(amount);
        this.balance = this.balance - amount - this.fee();
    }

    protected abstract int fee();
}
