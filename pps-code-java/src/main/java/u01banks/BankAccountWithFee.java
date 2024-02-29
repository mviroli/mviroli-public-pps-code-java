package u01banks;

public class BankAccountWithFee extends AbstractBankAccount {
    @Override
    protected int fee() {
        return 1;
    }
}
