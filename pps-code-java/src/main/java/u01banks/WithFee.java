package u01banks;

public class WithFee extends BankAccountDecorator {

    public WithFee(final BankAccount coreAccount) {
        super(coreAccount);
    }

    @Override
    public void withdraw(final int amount) {
        super.withdraw(amount+1);
    }
}
