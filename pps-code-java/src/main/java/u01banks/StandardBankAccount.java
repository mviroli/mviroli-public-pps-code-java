package u01banks;

public class StandardBankAccount extends AbstractBankAccount {
    @Override
    protected int fee() {
        return 0;
    }
}
