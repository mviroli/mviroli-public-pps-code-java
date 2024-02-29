package u01banks;

public class Rigid extends BankAccountDecorator {

    public Rigid(final BankAccount coreAccount) {
        super(coreAccount);
    }

    @Override
    public void withdraw(final int amount) {
        if (amount > coreAccount.getBalance()){
            throw new IllegalStateException();
        }
        super.withdraw(amount);
    }
}
