package u01run;

public abstract class AbstractBankAccount implements BankAccount {
    private int balance = 0;

    public final int balance() {
        return this.balance;
    }

    public final void deposit(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance + amount;
    }

    public final void withdraw(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance - amount - getFee();
    }

    protected abstract int getFee();

    private void checkNegativeArgument(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
