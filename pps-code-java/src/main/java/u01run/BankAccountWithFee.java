package u01run;

public class BankAccountWithFee extends AbstractBankAccount {

    @Override
    public int getFee() {
        return 1;
    }

}
