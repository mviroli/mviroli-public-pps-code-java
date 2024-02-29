package u01run;

public class FlexibleBankAccount implements BankAccount {
    private int balance = 0;
    private final FeeCalculator feeCalculator;

    public FlexibleBankAccount(FeeCalculator feeCalculator){
        this.feeCalculator = feeCalculator;
    }

    public final int balance() {
        return this.balance;
    }

    public final void deposit(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance + amount;
    }

    public final void withdraw(final int amount) {
        checkNegativeArgument(amount);
        this.balance = this.balance - amount - this.feeCalculator.computeFee();
    }

    private void checkNegativeArgument(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
