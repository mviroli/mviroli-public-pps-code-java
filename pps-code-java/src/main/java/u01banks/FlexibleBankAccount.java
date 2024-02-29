package u01banks;

public class FlexibleBankAccount implements BankAccount {
    private final Fee fee;
    protected int balance = 0;

    public FlexibleBankAccount(final Fee fee) {
        this.fee = fee;
    }

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
        if (this.balance < amount) {
            throw new IllegalStateException();
        }
        this.balance = this.balance - amount - this.fee.fee();
    }
}
